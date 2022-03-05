package com.anshinbackend.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtTokenUtil implements Serializable {
    private static final long serialVersionUID = -2550185165626007488L;

    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;




    @Value("${jwt.secret}")
    private String secret;

    // lay usename tu jwt
    public String getUserNameFromToken(String token){
        return getClaimFromToken(token, Claims::getSubject);
    }

    // thowi thoi gian hieu luc cua jwt
    public Date getExpirationDateFromToken(String token){
        return getClaimFromToken(token, Claims:: getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver){
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    // det lay bat cu thong tin nao tu token can khoa bi mat
    private Claims getAllClaimsFromToken(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();

    }

    // kiem tra jwt da het han chua
    private Boolean isTokenExpired(String token){
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    // tao token cho user
    public String generateToken(UserDetails userDetails){
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, userDetails.getUsername());
    }

    public String doGenerateToken(Map<String, Object> claims, String subject){

        //Acount acount = (Acount)_acountService.findAllAcount();
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+JWT_TOKEN_VALIDITY*1000))
                .signWith(SignatureAlgorithm.HS512,secret).compact();
    }

//        private String doGenerateToken2(
//            Map<String, Object> claims, String user ) {
//
//        Account accountE = accountRepo.findByUsername(user);
//
//        Account userToken =  new Account();
//        userToken.setUsername(user);
//        userToken.setId(accountE.getId());
//        userToken.setActivated(accountE.getActivated());
//        //userToken.setUserole(userEntity.getUserole());
//
//        Gson gson = new Gson();
//        String userStr = gson.toJson(userToken);
//
//        return Jwts.builder()
//                .setClaims(claims)
//                .setSubject(userStr)
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
//                .signWith(SignatureAlgorithm.HS512, secret).compact();
//    }

    public Boolean validateToken(String token, UserDetails userDetails){
        final String username= getUserNameFromToken(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }



}
