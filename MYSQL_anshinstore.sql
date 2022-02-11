-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 07, 2022 at 10:27 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `anshinstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `acounts`
--

CREATE TABLE `acounts` (
  `id` int(11) NOT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `full_name` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `is_actived` tinyint(4) DEFAULT NULL,
  `is_deleted` tinyint(4) DEFAULT NULL,
  `photo` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `acounts`
--

INSERT INTO `acounts` (`id`, `phone_number`, `full_name`, `password`, `email`, `is_actived`, `is_deleted`, `photo`) VALUES
(1, '(459) 613-9467', 'Letha Bolt', 'RMJelfmTrQMhVGTTUaUW5A==', 'Bolt@nowhere.com', 1, 0, '00A848KWUQ74'),
(2, '(730) 955-6764', 'Vanita Kelleher', 'NQORmuq2s5RRJgNN2sO8Ww==', 'Morehead@example.com', 1, 1, 'T3NO40JEX3LQ8SI15W4575'),
(3, '(681) 747-0352', 'Marcos Abraham', 'nIQ9BemXcOfsuE31juBnwQ==', 'qpzre411@example.com', 1, 1, 'I52'),
(4, '(513) 643-0254', 'Miyoko Mckinney', 'V4nE+4PqWuTQW67ttUnOSw==', 'Bray162@example.com', 0, 0, '7T'),
(5, '(776) 960-1978', 'Adolph Francisco', 'iHOktgBSJ10T4B4hFT1qDg==', 'Sidney_Agnew3@nowhere.com', 0, 1, 'R7'),
(6, '(943) 664-5705', 'Oma Lawler', 'btmz6uguZEF8blnbEL+TYg==', 'xmhz1900@nowhere.com', 1, 1, 'D76X'),
(7, '(282) 510-9326', 'Felix Alba', 'lhAfJTlHur+CDye0jrsjRw==', 'Monroe.Rinehart@nowhere.com', 1, 0, 'E9DL2Q507C02627871M5U1'),
(8, '(350) 234-6559', 'Eusebia Noland', 'LPmh03Or7eUJ1hc+6R94vQ==', 'Gutierrez73@example.com', 0, 1, 'V6N9SG2NVDS533QY504HS12T6S09DCX7JHN4N3U1P14UE720Y0KCZD65Y4N545K4X0R7Y67CRQ'),
(9, '(157) 934-3116', 'Denisha Mcginnis', 'TSN+B5tpyTahooDqgXYq1Q==', 'FelipaAbernathy@nowhere.com', 1, 1, '375M54'),
(10, '(465) 454-8347', 'Stanford Sullivan', '0QPpzU96B17qWXqL6Uezhg==', 'Adler@example.com', 0, 1, '0E85J6W'),
(11, '(122) 838-0637', 'Nathan Salisbury', 'Kq96WBa1XDnq5vYSckatmA==', 'uadm55@example.com', 1, 0, '5W4C84E6KH'),
(12, '(529) 468-6964', 'Burton Bunnell', 'zRB12Eil4BQr07XWZyYEHA==', 'Caldwell@example.com', 1, 1, 'BTL8K336H77098SW059MTLU9GK4S1L5G7H7S98M8869BV27SS4335I0530I8LW73NN103P'),
(13, '(789) 568-6157', 'Adah Jameson', 'z04t3ztjbz9olh0bsx7Vzw==', 'NathanielC_Christman823@example.com', 1, 1, 'K261F7Q918750Q49SXI353FTIF7UNCF2699889L207Y4F2D3O6EMT4PK3WWC2IIR6GO1ZB54SAW41'),
(14, '(507) 184-2162', 'Adam Geer', 'pGw7VPLJhxzYHa96kySZwA==', 'Valdez@example.com', 0, 0, 'LO0UKL5814IX1O71ZC96A98Z8S9IGU6O50U1I2WB6AE29XV6TP3IT330811X15M0B4QEAX'),
(15, '(948) 826-7804', 'Freeman Selby', 'IuShTOK1LQkdysgnirPpWw==', 'Rich.F_Hutchins@example.com', 0, 1, '49EH211YJL4H341LZ40TC5C7PG5N4Y16H'),
(16, '(286) 001-2185', 'Laura Barger', 'bg37j/3rQAdQLjYC4AXD7g==', 'phkfhcmu_jjjdjuvrms@example.com', 0, 1, '6LNBIK69K942QUZ6N3G7632CLG33C8EE2IX4I0Y'),
(17, '(718) 229-1171', 'Ariel Hermann', '1j+4salX3NeRdGGwcKQdiw==', 'AdalineW.Radford8@example.com', 1, 0, '0K497DCR6OD39KL1UO0UKYP6EAYX81HP58SXI1W66OIN82PZ672ZD41GMFJ5X131S5E68A803V45F97UC0PS35C8V922V59AHM56FC3B923FMSKZQRX'),
(18, '(659) 832-5274', 'Adam Maddox', 'wdxFfoOnNw/HY7Q2GiXKUw==', 'SmalleyS@nowhere.com', 0, 1, 'I8671X6P839X'),
(19, '(899) 567-0654', 'Winnifred Brantley', 'MFb0nzFEqL2uhnxp2Uug9Q==', 'gxsgr25@example.com', 0, 0, '3PY16307K25D'),
(20, '(674) 683-5376', 'Gayle Baugh', '1ipjVDQAJ+ooRn9NrkRj2Q==', 'ikzv7@nowhere.com', 0, 1, 'WU'),
(21, '(835) 754-7630', 'Delcie Abney', '70r6j5L9INlAKghckiTLaA==', 'AmosBliss189@example.com', 0, 1, '6JXJIE33671X1'),
(22, '(397) 639-0832', 'Kasey Furr', 'mjeaBCGGPpdRohsBoFcicA==', 'jajk3595@example.com', 1, 1, 'SYAN31Y62537MI7W'),
(23, '(878) 889-3248', 'Gertie Abel', 'XQUtyOEsp/n5fbBf9coPkg==', 'sdyfq9887@nowhere.com', 1, 1, 'KJ88AJ71118K9291CAK98MAKR327GX76O30515FR6V21'),
(24, '(792) 850-9043', 'Myles Angel', 'q2DgoXFjfFYqJHxW3hOsXQ==', 'Newsome21@example.com', 1, 0, 'US4'),
(25, '(898) 388-9426', 'Jerome Gipson', '1kOwmq+6of12T1MG7flbzg==', 'Hoover@example.com', 0, 0, '367J68H58J9493Q4OW5W9H7W01EWCTQ3Q06829O6NJJ937LQX4M9S3W5ML6QB4922R6EGRC1J5TUCI1D'),
(26, '(365) 356-4078', 'Lilla Perez', 'DjEHySF//hwwX9XfqpQlgw==', 'Russell@nowhere.com', 1, 0, '37NG8KK'),
(27, '(861) 549-7247', 'Josephine Norwood', 'J2x+SEvDzJXF+ijbdO+hFw==', 'DorcasLadner5@example.com', 0, 0, '9DQSDML1X2QY'),
(28, '(296) 043-6622', 'Elli Robertson', 'YFVWuuHjIZ0te/B+/LAsUw==', 'OlgaFerry@example.com', 1, 0, '1446AH1PC228921LT0892EZWC9L46M6'),
(29, '(461) 654-2968', 'Curtis Hutson', 'wUPQvEZdNUW9FpAXFcYcxA==', 'pqfmmt48@example.com', 0, 1, '1220PL0V7Y5SZAGF67PR517DSX9GK6D366HMZWUOJB4ND1NLQD83TF2NY'),
(30, '(463) 980-1962', 'Melia Gates', 'KuMTt3ewJzkt/N20kGlttw==', 'OdellG752@example.com', 0, 0, 'HG4VX7L5HK9MB'),
(31, '(113) 450-2756', 'Marc Pickering', 'vP7eGDSozS9n5HAiiMv1EQ==', 'LakeeshaAbel8@example.com', 0, 0, 'U0Y3'),
(32, '(249) 938-5859', 'Alida Jobe', 'hBe/AwVWsvKbhgtAn3oNIw==', 'Scarborough@example.com', 0, 0, '417YNW0V52D7S186131E'),
(33, '(894) 989-7256', 'Cordelia Key', 'TlVBsWzM39vZQqVwr2aQoQ==', 'MathewDeal16@example.com', 0, 1, '2HS3W176X29J36NM8WW0G18K2'),
(34, '(134) 228-5449', 'Reba Gregg', '9Ty+8Qldr3jhHryjP2/f0w==', 'LaveraLRoberge63@nowhere.com', 1, 1, 'PNX3LE42K573AD99653G5WLZ3T58W9P34'),
(35, '(896) 756-6541', 'Jarod Bourgeois', 'rHfFFQbgGFK6e08A9x0rvA==', 'LucillaAbreu267@example.com', 0, 1, '5'),
(36, '(948) 551-7855', 'Oliva Coble', 'PitSXEqlOdO4/4z3o4dcQQ==', 'Sturgill@example.com', 0, 0, 'A30OLKM537RI1VITOZL0564S6R4O0R372SJ3Y0LO4UV31724PHDL48TPU13Y4M86J018LR1KQ62896IH2E448AH0P53M9'),
(37, '(250) 604-2488', 'Corey Musgrove', 'iS6vp/HNxnlUboLYsp8TYQ==', 'pcvmbj959@nowhere.com', 0, 0, '630QHR78VAERTYKRPQY'),
(38, '(720) 779-2685', 'Bud Grubbs', '0ShxP5/7Uk/eHg8msDs+iw==', 'Ketchum@example.com', 1, 0, '064RN1XSUXFPFOWZHEQ0IO9T'),
(39, '(565) 967-6647', 'Newton Graves', 'GB+9C2t+Ltv36y4k1k/UGA==', 'CierraCheatham@nowhere.com', 0, 0, 'LH8A4NPRE1UI452ND875OJHB69A88HR3JG09I42ZUW8L'),
(40, '(748) 936-9702', 'Tamica Goins', 'euqc4O7z3zZ7JQItpzHqig==', 'Tanner_Banuelos@example.com', 0, 1, '2V4JLQV7247V3J6LV8B3T9Q5KCBTPM9X2I26706L44J19GEK459699YX9M0NLLEU86CS1L3TE5SZ899A0S24Q6CX03BGSY'),
(41, '(346) 279-2551', 'Bertram Herzog', 'nRofmkf8BKxT2nCjG4lXrg==', 'MalcomKnutson757@nowhere.com', 1, 1, '54Q25CW0SLCCQC0HRL1714T2MIL722I50484GHYA1ECB5F5A2SR5YRZE35C9VPX59D2CFTKM'),
(42, '(153) 446-2344', 'Malcolm Coward', 'u6uX0Q1tYNK2GiAsYEOk0A==', 'Alley91@example.com', 0, 1, 'B7DEQACWB5S9G8U342G5619474919313O27630'),
(43, '(871) 703-6933', 'Carley Valdez', 'juZKMjcci95WNwBFE6lBfA==', 'Nickie_B_Ambrose@nowhere.com', 0, 1, '3Q'),
(44, '(130) 566-1060', 'Lizzie Krueger', 'e8mS/BSQ0sDUB/bQXFioJg==', 'SanfordRivas721@example.com', 1, 1, 'C6432RI1U79A0T9Q9HQHB9N79FQ1BCA587XC6QNELA45272SM3'),
(45, '(852) 645-5229', 'Celestine Hong', '5ond6BFqdbhyrEyPeXIRKA==', 'Rudolph358@example.com', 1, 0, '0561B982TEVCKDC8'),
(46, '(303) 737-0588', 'Shonda Leake', 'wW18t/u64mzFXmFLUKUawg==', 'Tenisha_Mcclintock@nowhere.com', 0, 0, 'P'),
(47, '(542) 738-1744', 'Hubert Waldrop', 'kogU6gTBPj9HJkpMdCKrUQ==', 'utxpbh4739@example.com', 0, 1, 'G51'),
(48, '(307) 844-2142', 'Alphonso Meeks', 'Og2HXSypw0EAlQfQ7n1nsg==', 'Adolph.Antoine@example.com', 1, 1, '30SWCC8V88B8MH2CJR43KK1BZ00Y9770L'),
(49, '(705) 905-9161', 'Aimee Stamm', 'NiMAhfSGGCn5IftqCAXc/Q==', 'BalderasG5@example.com', 1, 1, '55RSXTQ5N4CV0'),
(50, '(267) 504-9171', 'Sonia Ackerman', 'NBsc/ceNuc911WuFNYRn9Q==', 'Ted.Mace49@example.com', 1, 1, 'V48ISL250179R38MPYV08C06U2O886U75070BJ2');

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `id` int(11) NOT NULL,
  `dress_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `dress_detail` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `acount_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`id`, `dress_name`, `dress_detail`, `acount_id`) VALUES
(1, 'Conrad1997', 'JK1', 24),
(2, 'Drew9', 'E7UKXI020499C3L1XC', 10),
(3, 'Kim1953', 'DT0R5U1UZKR5446AFUJ55N0F2', 21),
(4, 'Latonya2022', 'L2404P06C8AK68RH6698J642SJGO3UR616I0QQVXBB720206WQ19D2VYC568N45PIGRU7XB39F0Q14T4W', 28),
(5, 'Stamm465', '7131B47V358826Y6TD7819C70198CDC90', 34),
(6, 'Winkler2019', '2ZOV32C4WY0EJ7G2', 14),
(7, 'Brendan547', 'D3WPF2V90', 13),
(8, 'Gino2021', '92VE56S94S7QQ7S00', 39),
(9, 'Abby664', 'U2V4I3HJ10Z0PZ43C9MR1R3N379', 12),
(10, 'Jolene437', 'XS5YG8IO8X3', 20),
(11, 'Alonso441', 'U2', 8),
(12, 'Abby754', '2D31VP0JSIS3S81D4JY3Q52M', 4),
(13, 'Simpson5', '3B3Z9RT3I05V7KE5DS406LP', 31),
(14, 'Darius5', 'E', 27),
(15, 'Boling2025', 'E018H365XH11928Q9T19B375C45RWB6SNZ822F65C58CZ1C9MK9185297', 29),
(16, 'Abbie1953', 'Q54DX2W98IUDDO9GG5EYKFN3LQQCI89T882OW8NO815KE5RCTNGKA610MU517OAPUI9U4988VEP9A2Y46491502949VKITJG14U7OOPUV0I8W1DBBE', 33),
(17, 'Bernita1999', 'H1S9EMJ', 26),
(18, 'Deborah2002', '57AGQ1204DCC05CUKSC', 38),
(19, 'Earl2024', 'M6FQUM32L', 33),
(20, 'Constance1951', 'L4E2ZS2X2Z593U7WK963543I657', 13),
(21, 'Shon1986', 'P', 28),
(22, 'Justin1958', '85958', 2),
(23, 'Williams7', '53', 36),
(24, 'Cathy1961', '37032FFS8787I2MDW7V', 47),
(25, NULL, NULL, 43),
(26, 'Rocky1969', '70LX219P511Y78H43320ZM7048SV5VCTJ9AQ87G8U1R6ZU3JP7F205YMX096G3H5XP9166A253JLVMIO7858K419I2FQDW4R3324KK0K0ADRP59582P28L1E60SOJ58636BR4T9141IR1824Y8XUEQG80L3FJ3ST354', 26),
(27, 'Adaline2010', '4228N4404ST75A', 41),
(28, 'Drew35', 'UM567I7M7I2875F837K4Z750587LK4OLSWQHO', 7),
(29, 'Ray2015', 'TG4628H5SCLD441BPE0537534S71R', 7),
(30, 'Arvilla9', '671IP8M04C06GF3KNF', 12),
(31, 'Bourgeois2010', 'R2OHU0VVO3S4W5N4321QJ385L3Z828Y44IV', 15),
(32, 'Ron2016', 'BF62UTVS6S88K82C8F6NLK44UKL7RKAZ817F3Q5SMV20VS2D52SV0WE1JKGX381XK22U3M4', 10),
(33, 'Ada2007', '9Y9R05591W29817R1370J13', 33),
(34, 'Clelia1967', '7JM2N92SA89475HES3G535AG85Y58K6UVVE587EAWWQ1JT2E9IH4KG856T21Y2D2N86E4U', 35),
(35, 'Dillon2027', 'AGYV7RQV52E9UK27MZ7', 44),
(36, 'Washington5', 'T1N033RJ6181', 6),
(37, 'Packard2000', 'Q7W29GZG0Y38', 39),
(38, 'Bonilla2029', 'Z8', 49),
(39, 'Abbie2021', '8XJWPZZ80Z91', 48),
(40, 'Charla71', 'TLWB965E2I9IK62ZLIDKMH6J6', 6),
(41, 'Cher425', 'DC4CZ2RQBF587CZ683898', 18),
(42, 'Adah2028', '3PH9X467RCFS01R7T57FHSO28R65C1NHIS8X40LKX6K0L4IT2EY0BXI6S0478GG2NRX6963I8ZBINU1C64RRD3J49K2DOKXU9CRS2XCK36PK023665K3OH684TUJSY6', 27),
(43, 'Mosby661', '6O81Y3GB0FH74VW1202ZA14A23P0B2H1O07694T2UMX699D7D988H1O5A', 23),
(44, 'Hunter2027', 'DD3B', 40),
(45, 'Anglin1953', 'G1ZT497TLJK9FD9EXF658GR2', 15),
(46, 'Albert381', '7O', 38),
(47, 'Ordonez879', 'ZYVZ6YZ0Z3J9244B2JF17838X8ST5', 49),
(48, 'Burrell393', '6TL3617P4CDD5654Y2M7R689C6I8F34A4F', 41),
(49, 'Athena521', 'PO5BM91H648YOZ5U9A3U59RJE', 17),
(50, 'Alonzo218', 'FRJ7Y0OQ406JFW8R7700V', 22);

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `id` int(11) NOT NULL,
  `id_acount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`id`, `id_acount`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15),
(16, 16),
(17, 17),
(18, 18),
(19, 19),
(20, 20),
(21, 21),
(22, 22),
(23, 23),
(24, 24),
(25, 25),
(26, 26),
(27, 27),
(28, 28),
(29, 29),
(30, 30),
(31, 31),
(32, 32),
(33, 33),
(34, 34),
(35, 35),
(36, 36),
(37, 37),
(38, 38),
(39, 39),
(40, 40),
(41, 41),
(42, 42),
(43, 43),
(44, 44),
(45, 45),
(46, 46),
(47, 47),
(48, 48),
(49, 49),
(50, 50);

-- --------------------------------------------------------

--
-- Table structure for table `cart_items`
--

CREATE TABLE `cart_items` (
  `id` int(11) NOT NULL,
  `quanty` int(11) DEFAULT NULL,
  `id_cart` int(11) DEFAULT NULL,
  `product_detail_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart_items`
--

INSERT INTO `cart_items` (`id`, `quanty`, `id_cart`, `product_detail_id`) VALUES
(1, -8022, 22, 46),
(2, -617853697, 1, 44),
(3, -611296160, 27, 26),
(4, -1529059329, 22, 33),
(5, -2074967167, 39, 28),
(6, -1351511751, 30, 5),
(7, -1978680242, 46, 23),
(8, -42143390, 38, 35),
(9, -1010250639, 17, 46),
(10, -1198970815, 46, 32),
(11, -1126720611, 48, 39),
(12, -2132679197, 16, 13),
(13, -888759, 3, 8),
(14, -92, 10, 28),
(15, -779709428, 43, 7),
(16, -1062906427, 47, 23),
(17, -1025055090, 23, 47),
(18, -1198082057, 8, 26),
(19, -385002188, 32, 32),
(20, -1617477340, 45, 38),
(21, -395624865, 1, 49),
(22, -1103051678, 36, 28),
(23, -248316457, 8, 37),
(24, -903010867, 12, 13),
(25, -1450014244, 24, 32),
(26, -1507272580, 27, 25),
(27, -1720299079, 34, 49),
(28, -425689709, 15, 6),
(29, -1054381363, 12, 4),
(30, -28233071, 21, 6),
(31, -407956908, 2, 20),
(32, -2043566585, 44, 1),
(33, -1747315778, 17, 44),
(34, -1, 9, 12),
(35, -1692066009, 7, 4),
(36, -1413, 34, 37),
(37, -309902211, 44, 45),
(38, -776196547, 40, 4),
(39, -435636308, 6, 31),
(40, -1785613075, 34, 20),
(41, -1006591735, 25, 44),
(42, -1442076440, 14, 1),
(43, -1263665069, 9, 27),
(44, -22, 50, 40),
(45, -671772784, 3, 37),
(46, 7, 35, 31),
(47, -46, 47, 25),
(48, 64, 47, 14),
(49, 951, 8, 36),
(50, -283703309, 25, 12);

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `id` int(11) NOT NULL,
  `category_name` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `is_deleted` tinyint(4) DEFAULT NULL,
  `category_parent_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id`, `category_name`, `is_deleted`, `category_parent_id`) VALUES
(1, 'Áo khoác 2 lớp', 0, NULL),
(2, 'Đò nỉ', 0, NULL),
(3, 'Áo khoác dày', 0, NULL),
(4, 'Sơ mi - Quần dài', 0, NULL),
(5, 'Áo len', 0, NULL),
(6, 'Áo POLO', 0, NULL),
(7, 'Phụ kiện', 0, NULL),
(8, 'Áo khoác gió', 0, 1),
(9, 'Áo khoác da lộn', 0, 1),
(10, 'Áo khoác KAKI', 0, 1),
(11, 'Áo nỉ', 0, 2),
(12, 'Quần nỉ', 0, 2),
(13, 'Bộ nỉ', 0, 2),
(14, 'Áo phao bông', 0, 3),
(16, 'Áo khoác chần bông', 0, 3),
(17, 'Áo khoác lót bông', 0, 3),
(18, 'Áo Sơ mi dài tay', 0, 4),
(19, 'Áo sơ mi họa tiết', 0, 4),
(20, 'Áo sơ mi dài tay kẻ', 0, 4),
(21, 'Quần âu', 0, 4),
(22, 'Quần KAKI', 0, 4),
(23, 'Quần JEAN', 0, 4),
(24, 'Áo POLO trơn', 0, 5),
(25, 'Áo POLO họa tiết', 1, 5),
(26, 'Áo POLO kẻ', 0, 5),
(27, 'Outdoors', 0, 5),
(28, 'Thắt lưng', 0, 6),
(29, 'Ví', 0, 6),
(30, 'Giày', 0, 6);

-- --------------------------------------------------------

--
-- Table structure for table `colors`
--

CREATE TABLE `colors` (
  `id` int(11) NOT NULL,
  `color_name` varchar(100) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `colors`
--

INSERT INTO `colors` (`id`, `color_name`) VALUES
(1, 'Trắng'),
(2, 'ZinnwalditeBrown'),
(3, 'CeruleanBlue'),
(4, 'Vàng'),
(5, 'BlizzardBlue'),
(6, 'FerrariRed'),
(7, 'Chamoisee'),
(8, 'Wheat'),
(9, 'MediumTealBlue'),
(10, 'StilDeGrainYellow');

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `id` int(11) NOT NULL,
  `content` longtext DEFAULT NULL,
  `time_create` datetime(3) DEFAULT NULL,
  `id_product` int(11) DEFAULT NULL,
  `id_acount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`id`, `content`, `time_create`, `id_product`, `id_acount`) VALUES
(1, 'Q0V6MSUG9SMM68WF7896B8SI4H2BLPG', '2003-04-13 10:46:16.000', 18, 5),
(2, '9E587ELPDICPJW05OSFW2C93O3P34EFB05J438ZJOVON6OE17208SL37852790PU89QD', '1975-08-28 14:53:19.880', 1, 12),
(3, 'S18R6CH', '1981-07-26 06:23:15.020', 46, 13),
(4, '6N838', '1975-04-14 09:44:58.050', 11, 26),
(5, '40PT7RF2J2694E853', '2006-07-21 07:38:40.390', 37, 32),
(6, '50B8', '2013-03-26 09:23:41.160', 6, 18),
(7, 'B1DM6CT5C84DVQGC91S7Z1CGQZW0450XKBE021V853D78YS8O1DJ7U1UX1SMQDM', '2011-10-25 08:07:51.450', 20, 35),
(8, '44HM1CVH', '1977-09-02 13:51:08.280', 20, 5),
(9, 'S7W', '2021-10-03 17:02:01.000', 22, 1),
(10, '13363T5Y9UP1', '2014-02-28 19:25:58.330', 32, 31),
(11, '05HM60B5VI02389RR0KOD623U', '1982-03-12 11:14:30.040', 10, 35),
(12, 'TI856H2US70EP63G90', '2004-01-29 10:56:59.680', 16, 25),
(13, 'MQ0C55W4T3LV1J8F44P0L7CB346VUH633PWZ8E9MAG', '1993-12-08 15:14:10.190', 6, 15),
(14, '11KAPA', '2020-12-30 09:51:49.290', 35, 12),
(15, '4V', '2008-08-05 17:29:53.300', 17, 32),
(16, 'U2CL733CFA46N4H10T3RQ2UF792QG669YM40ZEC022KWNHZ2B480VEK3H69V5IPBT8L8FD11R5P7O0E700AW61W6B6Q7405607UUXIL0S1C4363HFES6IH9OT8L0LY3CAMG70HJPQM1YJ31P80O4TOB0U3R0DOKRR074D313UNNG5PI4H94YEISRR4TN56SE5HT35JJB', '1982-04-20 10:44:12.240', 13, 33),
(17, 'ZIB60A2Y7HC3J701065Z2083G2XD8LF86U14F50K1A636O5FIKFC3C6RM2', '2008-06-21 00:19:12.590', 43, 29),
(18, 'G7A7WFWYV0W50G4KFUN3Q9H4P0Y9Q38U51', '1989-11-13 05:51:06.330', 8, 22),
(19, 'S709L47170EZEF4CK86EDHN8XZ00T86T2NBT5O9', '1976-02-19 01:13:07.650', 28, 35),
(20, '14619LD71N', '1999-03-17 03:44:11.890', 34, 9),
(21, 'TF99J68DG168HG161AL0U919K16L0KV285DZ9813RAZRH33TTA52I5HWWY8NCJU3C90R7GJT1Z9L5SE3N8UO', '2006-11-04 23:52:57.680', 26, 12),
(22, '20HCT0094', '2013-07-21 08:19:16.860', 45, 23),
(23, 'AUUM61IFK2G8M', '1972-10-17 07:33:27.090', 15, 8),
(24, 'R5G1', '1970-10-10 16:59:21.320', 45, 28),
(25, 'YL6CM', '1985-12-01 09:06:05.080', 10, 2),
(26, 'Y1FX21M371F3Q', '1976-12-24 17:55:48.620', 44, 15),
(27, 'C3', '1970-07-15 05:43:35.390', 6, 35),
(28, 'PRS068LNFL1QG21SW', '1978-03-18 03:11:04.500', 34, 5),
(29, 'OHCX25FVMBG38721ST7GL90', '1976-02-29 16:33:08.340', 28, 17),
(30, 'F24046992627P902HZ683CA1K', '1976-03-12 02:41:41.970', 25, 26),
(31, 'NX92H9LT68K1C246B896O025827S74IVK82048MN2O23M5NCCJ2A81QA8345OJTV32VYV4VKF53', '2001-04-09 00:10:14.060', 20, 22),
(32, '615VCN7S73P', '1990-10-04 15:20:45.030', 11, 39),
(33, '2RY2329J1IYM13XZ10987424US6EBO06P9HB77I25YO84F0174833345GEV76707EDHJ3W0O24SKAO481623G76MQOGU95W61134WRMI5P9CJ330Y3HXZ1E948I7', '1975-08-12 16:20:50.000', 8, 29),
(34, '3Q94GRSYSD2LOH67X64W8VWZOU88T88', '1982-05-03 10:56:03.320', 8, 39),
(35, '1', '2007-09-04 18:26:40.500', 26, 36),
(36, 'U5TNY45CUSJP1LZUET6K4U5A052TP45ZHX', '2006-03-08 08:24:46.770', 28, 39),
(37, '7ZG6JDAZH0WR', '1987-06-28 18:58:58.190', 5, 9),
(38, '3ROC721R398IN63CF84DP71ZI51E66680E0A53H4438P4IZD', '2016-01-14 01:47:39.930', 20, 30),
(39, '2BN2MI5CI8D6C3KBQ971797M739L7M021R26544U9LG7G0VMT794ZZJ5DH3LU4C4U23XB6Q', '1984-05-25 07:02:35.220', 18, 16),
(40, 'D0P10NN8J11OIYG1Y6983P9T', '1999-06-27 20:32:37.770', 6, 2),
(41, '9F63X80K4X03V3B1Z54FCCYW3TK1J95OY57I2RHHU6EU64SA050NUR1F03MAQ1BF3CL64Z908376JK1VJZ645BSV3VA7PC405D5492860956XDLPKQENA4RW0Y020N9U25107723WGWZ68DX5EHS33OI0582BMQG8LC4992', '1987-08-23 19:41:28.560', 4, 39),
(42, 'V76OMJ', '1976-12-02 20:32:50.350', 26, 21),
(43, '919IXGBNQ', '2012-01-21 13:24:26.440', 42, 6),
(44, '99M8HE6VUNR5', '1976-11-11 21:15:26.060', 33, 4),
(45, 'FZ0I42926KB877Q199B7JRNF4GQOD1669N9E3914YZR23T344YGDK151787K0N242NTM31N5920G344GX8TGJ45W2Y', '2018-12-06 06:45:05.010', 7, 34),
(46, '956V9307B0PE1GV', '2006-09-26 02:37:51.940', 18, 16),
(47, '6XKA97803224NWH30V5M19W4FC52W7HM2ENQ4766', '2018-06-04 20:24:30.170', 5, 25),
(48, '48003M213GAOI032477L0D', '1993-05-14 13:59:30.960', 34, 25),
(49, 'FEZNR4', '2015-09-06 03:55:59.710', 12, 16),
(50, 'TUMFZNUD58F1Q0798VJK5IQ32T97VNPFJ95H0W5DY', '1990-10-07 23:55:41.470', 49, 36);

-- --------------------------------------------------------

--
-- Table structure for table `detail_orders`
--

CREATE TABLE `detail_orders` (
  `id` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` decimal(15,4) DEFAULT NULL,
  `id_product_detail` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detail_orders`
--

INSERT INTO `detail_orders` (`id`, `quantity`, `price`, `id_product_detail`, `order_id`) VALUES
(1, 52, '1963.4416', 3, 33),
(2, 71, '569.9451', 13, 18),
(3, 98, '1007.7067', 33, 40),
(4, 2, '108.9268', 39, 15),
(5, 42, '1721.9227', 38, 28),
(6, 58, '1113.8351', 28, 6),
(7, 77, '416.3885', 28, 39),
(8, 44, '894.4624', 46, 27),
(9, 79, '246.9990', 28, 49),
(10, 8, '830.0354', 21, 37),
(11, 75, '1198.5092', 37, 20),
(12, 8, '1039.8418', 20, 3),
(13, 47, '694.0343', 12, 7),
(14, 95, '971.5911', 28, 38),
(15, 3, '1843.8512', 20, 41),
(16, 62, '1863.9708', 7, 13),
(17, 54, '196.9298', 23, 15),
(18, NULL, NULL, 4, 24),
(19, 39, '1397.7276', 23, 28),
(20, 70, '435.8896', 2, 18),
(21, 86, '939.4359', 28, 6),
(22, 33, '504.3285', 48, 16),
(23, 5, '1170.4169', 32, 31),
(24, 9, '220.0362', 7, 20),
(25, 94, '175.0279', 28, 29),
(26, 7, '1603.1306', 43, 47),
(27, 10, '453.7139', 30, 17),
(28, 91, '181.4818', 28, 42),
(29, 96, '1095.5112', 40, 1),
(30, 56, '527.4206', 30, 37),
(31, 7, '125.8669', 28, 19),
(32, 22, '1301.3728', 5, 6),
(33, 36, '326.0790', 36, 27),
(34, 13, '906.8780', 18, 36),
(35, 81, '982.2502', 17, 21),
(36, 13, '181.2196', 9, 46),
(37, 33, '305.0349', 26, 21),
(38, 38, '1198.5521', 5, 35),
(39, 35, '402.9479', 31, 40),
(40, 11, '576.2549', 45, 1),
(41, 9, '1174.2618', 15, 24),
(42, 40, '1141.2439', 20, 17),
(43, 64, '338.4175', 49, 36),
(44, 24, '1258.8805', 26, 25),
(45, 56, '392.0884', 50, 11),
(46, 7, '102.3685', 2, 35),
(47, 34, '166.7040', 34, 44),
(48, 37, '1197.5562', 34, 50),
(49, 9, '1511.0323', 45, 43),
(50, 47, '175.6139', 42, 36);

-- --------------------------------------------------------

--
-- Table structure for table `detail_products`
--

CREATE TABLE `detail_products` (
  `id` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `import_price` decimal(15,4) DEFAULT NULL,
  `export_price` decimal(15,4) DEFAULT NULL,
  `id_product` int(11) DEFAULT NULL,
  `id_color` int(11) DEFAULT NULL,
  `id_size` int(11) DEFAULT NULL,
  `is_deleted` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detail_products`
--

INSERT INTO `detail_products` (`id`, `quantity`, `import_price`, `export_price`, `id_product`, `id_color`, `id_size`, `is_deleted`) VALUES
(1, 79, '1962.3856', '424.7872', 24, 8, 5, 0),
(2, 48, '629.6747', '657.9890', 9, 2, 6, 1),
(3, 32, '1286.7147', '374.8904', 14, 7, 5, 1),
(4, 61, '1950.9988', '776.7340', 28, 1, 10, 0),
(5, 14, '1660.6250', '776.3134', 23, 3, 10, 0),
(6, 65, '932.2096', '309.3450', 40, 7, 9, 0),
(7, 2, '720.9149', '1507.4688', 4, 3, 4, 0),
(8, 15, '1425.9687', '823.8616', 6, 7, 4, 0),
(9, 21, '723.5470', '1367.0828', 32, 1, 2, 0),
(10, 78, '1203.5847', '602.4627', 26, 2, 7, 0),
(11, 23, '1956.3486', '1409.6294', 27, 1, 10, 1),
(12, 23, '1221.7117', '1751.7880', 26, 8, 1, 1),
(13, 97, '1982.9396', '1329.4413', 38, 5, 10, 0),
(14, 8, '293.3564', '1632.3996', 9, 9, 1, 1),
(15, 86, '1110.5770', '561.8863', 5, 9, 6, 1),
(16, 97, '558.1204', '1925.5453', 33, 10, 6, 1),
(17, 96, '355.8489', '361.7071', 20, 2, 8, 1),
(18, 82, '507.4972', '1593.9121', 4, 2, 2, 1),
(19, 4, '1342.0364', '1764.4145', 12, 1, 5, 1),
(20, 34, '1725.5834', '1405.9917', 13, 7, 4, 1),
(21, 2, '374.8879', '1792.0135', 15, 7, 3, 0),
(22, 8, '950.1300', '1224.0162', 24, 4, 2, 0),
(23, 23, '1470.2271', '1434.9342', 11, 6, 10, 0),
(24, 75, '753.2554', '648.3174', 1, 4, 5, 1),
(25, 96, '368.6584', '556.1924', 17, 4, 2, 1),
(26, 21, '1927.7424', '192.0323', 13, 4, 4, 1),
(27, 13, '1149.1638', '533.2034', 26, 1, 10, 0),
(28, 35, '1686.7502', '1242.0311', 39, 6, 4, 0),
(29, 86, '649.7074', '830.0159', 34, 1, 8, 0),
(30, 16, '912.5237', '194.2338', 23, 1, 10, 1),
(31, 61, '461.0873', '997.4400', 17, 3, 5, 0),
(32, 95, '133.2393', '804.3268', 12, 2, 6, 1),
(33, 87, '1024.0888', '494.5874', 20, 9, 10, 1),
(34, 76, '219.7412', '257.2673', 9, 10, 1, 1),
(35, 66, '1287.1946', '535.0664', 36, 10, 6, 0),
(36, 71, '1562.7741', '1048.2830', 5, 8, 1, 1),
(37, 18, '495.9498', '610.5661', 35, 6, 6, 1),
(38, 36, '1635.2958', '1905.7103', 36, 4, 4, 0),
(39, 39, '804.6319', '790.5237', 1, 7, 8, 0),
(40, 31, '1384.2685', '814.0026', 36, 6, 3, 1),
(41, 75, '617.1812', '1439.0595', 21, 8, 9, 1),
(42, 95, '855.4968', '1861.2421', 22, 8, 9, 0),
(43, 78, '274.8316', '1456.8201', 14, 3, 4, 0),
(44, 95, '606.8496', '348.3214', 10, 4, 1, 0),
(45, 6, '1380.7593', '1290.2909', 23, 6, 8, 0),
(46, 65, '1326.4040', '298.8442', 15, 9, 9, 1),
(47, 22, '980.9528', '1032.2823', 7, 1, 6, 1),
(48, 89, '626.3919', '1657.1732', 39, 10, 10, 0),
(49, 27, '375.9696', '1618.9735', 17, 8, 10, 0),
(50, 8, '641.8255', '1131.4124', 5, 3, 6, 1);

-- --------------------------------------------------------

--
-- Table structure for table `discounts`
--

CREATE TABLE `discounts` (
  `id` int(11) NOT NULL,
  `discount` decimal(15,4) DEFAULT NULL,
  `product_detail_id` int(11) DEFAULT NULL,
  `sale_Event_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `discounts`
--

INSERT INTO `discounts` (`id`, `discount`, `product_detail_id`, `sale_Event_id`) VALUES
(1, '8573019.6223', 45, 2),
(2, '169411.9365', 15, 4),
(3, '4181037.8998', 34, 5),
(4, '9924484.7752', 1, 2),
(5, '5356437.0692', 28, 6),
(6, '2041246.4383', 25, 7),
(7, '1988673.2212', 49, 9),
(8, '7.6140', 32, 7),
(9, '8.6924', 35, 8),
(10, '8972748.9459', 23, 2),
(11, '986.8232', 27, 10),
(12, '8177.5391', 14, 7),
(13, '0.2251', 31, 4),
(14, '1995563.4847', 48, 6),
(15, '2315.6978', 10, 3),
(16, '2693.4615', 6, 10),
(17, '3074181.3162', 22, 6),
(18, '9612636.9005', 14, 2),
(19, '5604.5828', 26, 6),
(20, '569448.8064', 13, 1),
(21, '685.8682', 43, 3),
(22, '3.4300', 16, 7),
(23, '6903271.7766', 29, 7),
(24, '1521465.3790', 26, 3),
(25, '1671865.4228', 32, 1),
(26, '3710.6861', 12, 10),
(27, '8822464.2750', 44, 9),
(28, '7394160.6934', 7, 2),
(29, '7.6910', 46, 5),
(30, '75.0119', 16, 7);

-- --------------------------------------------------------

--
-- Table structure for table `favories`
--

CREATE TABLE `favories` (
  `id` int(11) NOT NULL,
  `time_create` datetime(3) DEFAULT NULL,
  `id_product` int(11) DEFAULT NULL,
  `id_acount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `favories`
--

INSERT INTO `favories` (`id`, `time_create`, `id_product`, `id_acount`) VALUES
(1, '1973-02-02 08:57:20.880', 34, 5),
(2, '2018-08-12 20:21:45.750', 13, 36),
(3, '1998-09-27 07:43:06.790', 41, 14),
(4, '2014-07-27 05:45:02.300', 7, 38),
(5, '1983-07-31 16:21:10.260', 43, 21),
(6, '1992-11-22 20:28:47.020', 28, 10),
(7, '1986-07-27 10:10:26.750', 4, 23),
(8, '2001-02-17 14:57:22.480', 28, 9),
(9, '2010-10-01 18:26:48.780', 45, 38),
(10, '1991-09-25 01:18:14.680', 32, 17),
(11, '1971-05-24 12:40:20.140', 24, 3),
(12, '2014-05-23 21:05:49.530', 28, 27),
(13, '2007-04-03 07:06:04.590', 19, 36),
(14, '1993-11-10 19:51:31.170', 18, 35),
(15, '2019-04-12 05:40:18.810', 9, 6),
(16, '1976-08-19 13:50:54.080', 2, 16),
(17, '2019-05-11 20:14:18.400', 28, 36),
(18, '1978-01-09 17:00:55.920', 40, 32),
(19, '2014-10-30 00:15:59.090', 14, 23),
(20, '1996-07-11 22:01:02.220', 34, 21),
(21, '1979-04-09 13:34:59.690', 48, 20),
(22, '1983-02-18 01:24:44.960', 39, 25),
(23, '1989-02-03 10:23:26.670', 20, 11),
(24, '1992-01-10 14:17:29.930', 16, 27),
(25, '1987-10-03 07:06:46.090', 23, 15),
(26, '2001-03-21 15:49:04.780', 25, 23),
(27, '1976-12-21 10:47:54.740', 34, 39),
(28, '1978-07-19 04:05:58.560', 45, 35),
(29, '2000-08-09 01:36:03.940', 16, 29),
(30, '2010-10-16 16:39:28.890', 11, 10),
(31, '2006-05-04 03:37:14.760', 25, 6),
(32, '1981-09-07 03:59:55.980', 34, 20),
(33, '2005-11-22 08:23:12.100', 18, 27),
(34, '1984-04-27 08:09:01.220', 45, 29),
(35, '1979-05-09 07:52:04.390', 28, 14),
(36, '2004-10-23 01:50:57.350', 49, 2),
(37, NULL, 32, 16),
(38, '1977-10-13 03:20:31.690', 25, 6),
(39, '2001-02-01 18:43:13.030', 16, 1),
(40, '2004-05-16 14:32:17.150', 38, 17),
(41, '2019-10-24 07:58:41.360', 46, 27),
(42, '2011-04-08 08:05:27.550', 24, 9),
(43, '2015-01-15 00:04:25.360', 47, 14),
(44, '2005-12-14 14:41:23.240', 23, 38),
(45, '2013-02-11 13:17:03.000', 44, 18),
(46, '2013-04-03 12:37:07.560', 20, 6),
(47, '1991-12-03 00:33:29.340', 33, 36),
(48, '1990-12-04 15:07:38.460', 32, 11),
(49, '2001-12-23 03:13:17.860', 43, 34),
(50, '1974-01-11 07:16:51.000', 33, 23);

-- --------------------------------------------------------

--
-- Table structure for table `history_orders`
--

CREATE TABLE `history_orders` (
  `id` int(11) NOT NULL,
  `date_create` datetime(3) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `description` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `history_orders`
--

INSERT INTO `history_orders` (`id`, `date_create`, `order_id`, `description`) VALUES
(1, '2020-02-24 16:41:53.900', 39, 'Aspernatur incidunt beatae laudantium in qui vitae vel unde, obcaecati rem autem vel numquam est;\r\nNumquam et officiis illo corporis ut fugiat libero dolorem voluptates, voluptatem atque aut accusantium molestias. Reprehenderit debitis magnam sunt nulla unde cupiditate qui sit ipsum voluptatem autem natus beatae dicta. Quo dolores, rem dignissimos consequatur id eaque corrupti id repellendus qui assumenda voluptatem maiores ipsam. Exercitationem qui non repellendus quas soluta qui molestiae perspiciatis nobis quia dicta perferendis sed eum; sit deserunt deleniti sunt, molestiae unde tenetur ut provident obcaecati molestiae natus tenetur pariatur et. Libero perspiciatis accusantium ea quia illo quae recusandae qui quam qui possimus vel tempora eaque. Aut ea, consequatur eos iste consequatur voluptas non necessitatibus delectus et ea consequatur ut magnam! Beatae dolorem fugit id soluta sed iste unde neque vitae illo rem, consequatur omnis laborum; officia natus molestiae magnam sint dignissimos est non aut cupiditate dolores iste dolor repellendus consequatur. Blanditiis perspiciatis aut minus saepe nisi eveniet eius ut suscipit ex eos autem nulla placeat! Ipsum omnis laborum fugit laudantium perspiciatis, et in fuga adipisci officia ratione accusamus vel architecto. Illo omnis distinctio quia animi velit repellendus enim sed voluptatum iste suscipit sit aperiam velit? Minus sed corporis natus nesciunt reiciendis et eum omnis sit ipsam et nisi omnis est. Veniam laboriosam aliquam voluptatem qui non totam aut inventore cumque nisi cumque, et molestiae illum! Optio quia et illo sit, explicabo eos alias sed ut voluptatibus facere error eos sed. Soluta accusamus rerum laborum veritatis voluptate deserunt autem enim accusamus voluptas aliquid sed ad consequatur. Porro veritatis quae et dolor et ipsa beatae quidem ut quia voluptates error iste neque;\r\nRepudiandae iusto et maiores adipisci dolorum ut aut quasi quos magni aspernatur aliquid nihil in. Ad eos voluptatum rem ratione autem et iste consequuntur iste earum qui eaque fugit iste! Omnis ipsam quidem facilis rerum ut neque sint est aut non officia a atque sit. Minus dolorem harum sapiente explicabo ratione placeat sunt qui omnis voluptatibus, ut ipsam aspernatur voluptas. Dolor quaerat sint vel sit dignissimos laudantium velit qui sed earum eum ut iusto aliquam. Minus pariatur et rerum eaque odit ea ad non sed quidem mollitia quasi deserunt ut? Perspiciatis tempore aliquid, dolores aliquam vel suscipit architecto voluptatem iste voluptas fugiat at maxime numquam. Atque sed quo quos doloribus, quia dignissimos temporibus repellat et hic neque temporibus quos est. Et sunt porro, impedit nostrum molestiae animi voluptatem autem quod enim vitae dignissimos quibusdam reiciendis. Asperiores ut quam, corporis autem architecto nostrum est cumque quia dolor sit distinctio optio enim. Ea dolorum totam alias quis natus, quia totam aut voluptatem ipsam unde expedita voluptatem itaque! Et ut quos mollitia officia et suscipit dolore asperiores cum quod praesentium possimus harum modi. Odit et ut perspiciatis omnis quia, aperiam est libero labore perspiciatis sint sunt omnis minus! Nostrum natus omnis aliquid aperiam aut repellat, ab adipisci eligendi odit sed natus distinctio eos? Fugit ipsum molestias, dicta qui est perspiciatis et sit nisi tempore sit et dicta veniam.'),
(2, '2020-02-24 16:41:53.900', 39, 'Aspernatur incidunt beatae laudantium in qui vitae vel unde, obcaecati rem autem vel numquam est;\r\nNumquam et officiis illo corporis ut fugiat libero dolorem voluptates, voluptatem atque aut accusantium molestias. Reprehenderit debitis magnam sunt nulla unde cupiditate qui sit ipsum voluptatem autem natus beatae dicta. Quo dolores, rem dignissimos consequatur id eaque corrupti id repellendus qui assumenda voluptatem maiores ipsam. Exercitationem qui non repellendus quas soluta qui molestiae perspiciatis nobis quia dicta perferendis sed eum; sit deserunt deleniti sunt, molestiae unde tenetur ut provident obcaecati molestiae natus tenetur pariatur et. Libero perspiciatis accusantium ea quia illo quae recusandae qui quam qui possimus vel tempora eaque. Aut ea, consequatur eos iste consequatur voluptas non necessitatibus delectus et ea consequatur ut magnam! Beatae dolorem fugit id soluta sed iste unde neque vitae illo rem, consequatur omnis laborum; officia natus molestiae magnam sint dignissimos est non aut cupiditate dolores iste dolor repellendus consequatur. Blanditiis perspiciatis aut minus saepe nisi eveniet eius ut suscipit ex eos autem nulla placeat! Ipsum omnis laborum fugit laudantium perspiciatis, et in fuga adipisci officia ratione accusamus vel architecto. Illo omnis distinctio quia animi velit repellendus enim sed voluptatum iste suscipit sit aperiam velit? Minus sed corporis natus nesciunt reiciendis et eum omnis sit ipsam et nisi omnis est. Veniam laboriosam aliquam voluptatem qui non totam aut inventore cumque nisi cumque, et molestiae illum! Optio quia et illo sit, explicabo eos alias sed ut voluptatibus facere error eos sed. Soluta accusamus rerum laborum veritatis voluptate deserunt autem enim accusamus voluptas aliquid sed ad consequatur. Porro veritatis quae et dolor et ipsa beatae quidem ut quia voluptates error iste neque;\r\nRepudiandae iusto et maiores adipisci dolorum ut aut quasi quos magni aspernatur aliquid nihil in. Ad eos voluptatum rem ratione autem et iste consequuntur iste earum qui eaque fugit iste! Omnis ipsam quidem facilis rerum ut neque sint est aut non officia a atque sit. Minus dolorem harum sapiente explicabo ratione placeat sunt qui omnis voluptatibus, ut ipsam aspernatur voluptas. Dolor quaerat sint vel sit dignissimos laudantium velit qui sed earum eum ut iusto aliquam. Minus pariatur et rerum eaque odit ea ad non sed quidem mollitia quasi deserunt ut? Perspiciatis tempore aliquid, dolores aliquam vel suscipit architecto voluptatem iste voluptas fugiat at maxime numquam. Atque sed quo quos doloribus, quia dignissimos temporibus repellat et hic neque temporibus quos est. Et sunt porro, impedit nostrum molestiae animi voluptatem autem quod enim vitae dignissimos quibusdam reiciendis. Asperiores ut quam, corporis autem architecto nostrum est cumque quia dolor sit distinctio optio enim. Ea dolorum totam alias quis natus, quia totam aut voluptatem ipsam unde expedita voluptatem itaque! Et ut quos mollitia officia et suscipit dolore asperiores cum quod praesentium possimus harum modi. Odit et ut perspiciatis omnis quia, aperiam est libero labore perspiciatis sint sunt omnis minus! Nostrum natus omnis aliquid aperiam aut repellat, ab adipisci eligendi odit sed natus distinctio eos? Fugit ipsum molestias, dicta qui est perspiciatis et sit nisi tempore sit et dicta veniam.'),
(3, '2019-12-14 06:08:25.800', 6, 'Provident dicta veniam autem itaque optio aperiam unde quaerat eius ut dolorem quae optio corporis. Quia dignissimos explicabo sint sed facilis autem ut similique, est nobis dolor temporibus autem ullam. Quia nisi a et vel nisi est qui ut id quo vel porro sed quam! Rem perspiciatis qui culpa voluptatem architecto quibusdam ducimus nostrum consequatur consequuntur molestiae deserunt cum consectetur? Sit eum quis quia sed aut odio dolor, velit dicta nihil quod natus quis quia. Error a voluptate distinctio in ut qui error consequatur nobis impedit debitis exercitationem consequatur corporis.'),
(4, '1978-10-09 19:07:34.890', 9, 'Et sint ducimus officia aut vel corporis et sit voluptatem sint ex et autem quis. Sequi provident qui, ad ullam quae exercitationem ipsum et voluptatum tempora ullam provident omnis quia. Ex tempore, provident sapiente ut est qui aut iusto et numquam error neque voluptatem unde. Et fuga accusamus voluptatem architecto atque ut aut non temporibus ab ipsam ad quibusdam amet? Vitae ut sed maiores illum est voluptas veritatis nihil perspiciatis non ut doloremque neque inventore. Deserunt unde vel facilis dolorum fugit doloribus iste alias exercitationem aspernatur est mollitia blanditiis ut! Minima temporibus reiciendis consequatur illo qui, delectus ut laborum necessitatibus veritatis nostrum sit voluptas ea. In ut earum error nisi, et temporibus rerum tenetur obcaecati officia non ratione sit accusantium? Voluptatem aut porro voluptas inventore quos numquam autem nesciunt qui necessitatibus architecto sunt incidunt voluptatum. Id a id non dolorum culpa quisquam nihil neque voluptatem facilis, molestiae sequi tempora et? Ut ea a esse libero debitis blanditiis tempore et nisi rem amet nobis, est omnis! Suscipit et ut quia corporis non suscipit omnis est laudantium voluptatum omnis quia dolore et. Sit tenetur aliquam dolor consequatur delectus nihil hic odit sed vel sapiente ea aut quo. Velit et inventore laudantium voluptatem sed non sed soluta natus sit consequatur optio praesentium iusto. Voluptatem qui reprehenderit perspiciatis veniam optio voluptatem exercitationem autem magni consequuntur molestias hic omnis ex.'),
(5, '2007-06-18 11:19:51.390', 36, 'Cupiditate facilis sed numquam velit quae incidunt neque et natus eos corrupti ducimus vel perspiciatis. Quam aut nam, laborum eius rerum eligendi rerum et quia iste alias ea sit et! Aut repudiandae dolorem nostrum omnis perspiciatis dicta eligendi ratione facilis voluptatem labore iusto quia magni. Quas ab hic, quam reprehenderit voluptas sit ipsam quos quis quaerat rerum eveniet quasi natus. Facere natus possimus ipsam aspernatur nesciunt qui laudantium qui temporibus veritatis corrupti ipsum excepturi alias. Velit quia dolores tempora qui et maiores ipsam rerum qui maiores earum distinctio perspiciatis assumenda! Debitis deleniti cumque aut pariatur illo ipsum similique aliquam et aperiam voluptatem, unde nulla perferendis. Assumenda suscipit beatae placeat sed ut odit itaque nostrum et, qui beatae id quos non. Illo totam sed, ad sit accusantium fugiat nobis labore ut aut cupiditate eveniet amet aut; perferendis nemo ipsam, quia velit vel rerum natus perspiciatis sit repudiandae ea debitis consectetur pariatur. Ut sit possimus qui ut sit sed est impedit animi velit qui perspiciatis explicabo maxime. Corrupti exercitationem voluptas voluptate consequuntur ut quos nobis recusandae ducimus soluta omnis officia illum quisquam! Ipsam omnis voluptatem perspiciatis ut error eius iste odio nesciunt quia assumenda ut nostrum sapiente. Obcaecati in labore quis non qui excepturi ut nostrum amet magni iste sed aut non? Voluptatem aliquam et voluptatem eos eaque ab ut eos accusantium excepturi iste quis beatae odio! Dolore labore alias, quos vero iste facilis quia molestiae ut eligendi possimus quam optio dolor.'),
(6, '2010-06-23 06:15:34.440', 32, 'Cum fugiat voluptas voluptate nostrum facilis dicta, odit ratione placeat rerum laborum autem voluptatem optio. Iusto officiis ut rerum dolore iure itaque iste natus ea consectetur numquam rerum sint ipsam;\r\nMollitia deserunt, dolorem ut rerum ipsa inventore officia repudiandae rem itaque aut natus sit sunt. Hic commodi et debitis nesciunt odit reprehenderit est deserunt cumque eligendi aut expedita adipisci voluptas. Sunt porro voluptatem omnis et ea sed placeat aut nulla praesentium sint amet saepe nulla. Porro ut perspiciatis itaque deleniti est tenetur, et totam magni cupiditate a quis adipisci laboriosam. Cum mollitia vitae in aut explicabo eos facere voluptas aperiam vitae ea eos possimus odit. Commodi explicabo ea ad incidunt harum voluptatem accusamus sed omnis quis eum ut dolorum est! Vel natus ut iste dolorem voluptatibus possimus fugiat in velit molestias minima fugiat voluptatem possimus. Autem nostrum incidunt repudiandae unde odit minus laborum autem laboriosam ut est ducimus et consectetur. Ab iste corporis magni placeat iusto cumque placeat et qui rem et commodi enim ipsum! Ullam sed non itaque natus ut ipsa deserunt, sed vitae perspiciatis pariatur rerum libero facere. Eum ea tempore similique iusto facilis ipsum voluptatem et ut voluptatem dignissimos rerum accusantium repellendus. Fuga nemo ullam error asperiores error molestiae quam quo consectetur omnis, qui tenetur rerum deserunt; vel illum facilis, necessitatibus aperiam sed consequatur et ea quo et vitae rem natus minus. Facere error ut quod labore dolor sit omnis perspiciatis voluptatem ad exercitationem, et est sint. Assumenda et modi dolorem quasi deserunt ipsum tempore cumque sunt nisi qui exercitationem velit error. Itaque alias autem earum blanditiis itaque ex alias ut, quia labore natus magnam et commodi; sint unde et asperiores neque aut nulla consequatur aut sed tempora eum eveniet qui veniam? Cumque explicabo odit aliquam distinctio placeat voluptas perspiciatis aspernatur doloremque optio aut omnis iste voluptates. Est aut veritatis labore ut laudantium nihil natus vero non magni repellendus aperiam quisquam ea!'),
(7, '2010-12-30 01:06:38.930', 26, 'Est nobis impedit fuga ipsa voluptatem repellendus aspernatur itaque eum sit libero at non quia. Quae et, fugit sed omnis soluta expedita eum enim cum odio sequi eos molestiae consequatur; quia voluptate vel impedit ad dolor unde eos at dolor sed qui quisquam laudantium sed. Iste quam exercitationem labore distinctio eius, exercitationem quis possimus et qui veniam veritatis neque in. Ducimus dignissimos iste qui, earum voluptatem sed et possimus voluptatem vitae alias aliquam et dolorum..;\r\nError pariatur officia qui accusamus ut a omnis et accusantium et quisquam, laboriosam provident et;\r\nEum et aut saepe cupiditate in adipisci porro eos obcaecati reprehenderit aliquam est et voluptatem. Esse ullam beatae est ab rerum molestiae non cumque fugit vel itaque quisquam odio ab. Exercitationem corporis distinctio perspiciatis sit et sit fuga est qui exercitationem nulla animi unde aliquid! Laboriosam vitae quam aut sit debitis autem dignissimos dolores inventore commodi quis aliquam nemo saepe. Recusandae aut nisi voluptatem accusantium non ipsa quaerat facere et magni aspernatur illo et ea? Blanditiis et qui similique dolor voluptas est sit libero repudiandae vel eos recusandae ullam dolores. Quis ut et, aut maxime ipsam nemo et ea unde quo voluptatem et voluptatem omnis. Iste consequatur laboriosam aliquid harum dolores repellendus assumenda qui ipsam maxime quis qui ipsum ab. Est sed dolor optio quis earum quia aut minus ipsum sapiente est enim quis fugit! Ipsam autem ut sint, voluptas necessitatibus facilis nostrum sit et ut ea labore amet sunt. Repellat similique aperiam nam aut qui blanditiis est perspiciatis voluptates unde saepe rerum ut vero. Voluptatum illum tempore et aut maiores nemo sed molestiae sed porro culpa, consequuntur velit natus? Tenetur optio eveniet minima, omnis eum perspiciatis et dolorem et est repellendus deserunt hic eos. Natus at et esse accusamus perspiciatis aliquid qui consequatur, excepturi nemo doloremque aut libero vitae! Ut aliquam voluptatem quisquam doloribus maiores aut et eum dolorum saepe et molestiae ipsa maiores. In qui aut, aperiam ipsa dolorem doloremque numquam minima non ut quibusdam sed suscipit unde.'),
(8, '1983-03-16 00:14:20.290', 40, 'Et asperiores eaque numquam atque rem atque vel eius eligendi amet alias rem maiores omnis. Quisquam necessitatibus excepturi perspiciatis qui vero ab delectus ut qui sint sit harum cumque vitae! Quia ipsum voluptatem officia velit atque inventore sint ea natus sit mollitia ipsum expedita quo. Esse pariatur optio iste cupiditate repudiandae voluptatem sed qui sit ut error non ut soluta;\r\nDebitis aperiam omnis ullam et qui consectetur dignissimos et amet quia nesciunt ut, perferendis nemo. Dolor deserunt aut fuga quia, aperiam possimus voluptatibus sed quo tempora mollitia aut qui error. Voluptatem deleniti nihil nostrum quia commodi suscipit iste officiis eveniet porro molestiae esse blanditiis est; commodi dolor esse quia dolor autem aperiam rem ut dolorum rerum necessitatibus voluptates cumque aut. Ea odit sint quod at nostrum laudantium ipsa autem libero earum expedita culpa eius voluptate. Autem earum, consequuntur quia minima velit facere numquam sed mollitia excepturi totam maxime expedita repellat! Blanditiis aut blanditiis et sint iste quia nulla dolor assumenda ipsam eius in recusandae commodi. Velit qui inventore, odit adipisci omnis ut non cum ipsum rerum enim ipsam rerum et. Natus eos natus repellat ut, error quas doloremque fugiat exercitationem iste perspiciatis rerum molestiae voluptatem. Eos quae eum ut nesciunt voluptatem dolores dolorem iusto enim sint nostrum provident iste sunt. Qui error non sed aut sed omnis qui rem sint non omnis possimus, tempora doloribus. Sed consequuntur sit asperiores qui est quia enim qui voluptate veniam, velit exercitationem itaque tempore;\r\nCupiditate ex quibusdam quam beatae asperiores ducimus error possimus enim deleniti possimus et perspiciatis nostrum. Corporis tempore, deleniti animi dolores non autem error minus nemo laudantium consequatur quae ut deserunt. Illum dolorem, voluptas exercitationem magni perspiciatis odit sed aut et unde odit ut atque minima. Est vero eaque, at excepturi deserunt culpa id vero sapiente iure sunt laborum ipsam quam. Ut reiciendis veniam incidunt amet, odio voluptates id dolorem aut minus omnis qui natus dolores! Natus necessitatibus molestiae ut, reiciendis ut facilis rerum aut voluptatem neque officiis praesentium quae et. Dolore exercitationem quaerat aspernatur aliquam error necessitatibus ad tempora qui molestias earum voluptates nostrum provident? Nam ut non omnis sequi architecto non nihil incidunt fuga cum pariatur similique sit culpa. Consectetur non, voluptatem et natus sapiente eveniet fuga unde modi laboriosam ad quos odio qui. Sed aspernatur enim minima cumque quae laudantium atque qui tempora omnis quibusdam animi aliquam ipsa; quas voluptas sit, rem quis est porro dolor quos ab ipsum aperiam porro eveniet quae. Et architecto ad vel, perspiciatis omnis culpa quae sit iusto suscipit unde aut rem quo? Aliquam rerum consectetur voluptatem iste voluptatem ut vitae dolores error dolore ex ut et distinctio. Sunt voluptatem perspiciatis corporis esse eum ut hic et quos mollitia nostrum aliquid aperiam laudantium? Fugit ipsum et alias voluptates earum iste sit, sed vel error nisi quisquam ab repellendus. Animi numquam, aut consectetur earum odit nisi architecto iusto quo quia unde quidem illo enim. Quos nemo itaque dolor iste eligendi qui amet quas accusantium similique tempora sapiente inventore accusantium? Consequatur reprehenderit et id iure aut quibusdam natus ut eligendi atque eligendi ut aut commodi. Aliquid laudantium temporibus commodi non illo delectus ex voluptatibus rem mollitia magni omnis consequatur nulla.'),
(9, '2020-02-24 16:41:53.900', 39, 'Aspernatur incidunt beatae laudantium in qui vitae vel unde, obcaecati rem autem vel numquam est;\r\nNumquam et officiis illo corporis ut fugiat libero dolorem voluptates, voluptatem atque aut accusantium molestias. Reprehenderit debitis magnam sunt nulla unde cupiditate qui sit ipsum voluptatem autem natus beatae dicta. Quo dolores, rem dignissimos consequatur id eaque corrupti id repellendus qui assumenda voluptatem maiores ipsam. Exercitationem qui non repellendus quas soluta qui molestiae perspiciatis nobis quia dicta perferendis sed eum; sit deserunt deleniti sunt, molestiae unde tenetur ut provident obcaecati molestiae natus tenetur pariatur et. Libero perspiciatis accusantium ea quia illo quae recusandae qui quam qui possimus vel tempora eaque. Aut ea, consequatur eos iste consequatur voluptas non necessitatibus delectus et ea consequatur ut magnam! Beatae dolorem fugit id soluta sed iste unde neque vitae illo rem, consequatur omnis laborum; officia natus molestiae magnam sint dignissimos est non aut cupiditate dolores iste dolor repellendus consequatur. Blanditiis perspiciatis aut minus saepe nisi eveniet eius ut suscipit ex eos autem nulla placeat! Ipsum omnis laborum fugit laudantium perspiciatis, et in fuga adipisci officia ratione accusamus vel architecto. Illo omnis distinctio quia animi velit repellendus enim sed voluptatum iste suscipit sit aperiam velit? Minus sed corporis natus nesciunt reiciendis et eum omnis sit ipsam et nisi omnis est. Veniam laboriosam aliquam voluptatem qui non totam aut inventore cumque nisi cumque, et molestiae illum! Optio quia et illo sit, explicabo eos alias sed ut voluptatibus facere error eos sed. Soluta accusamus rerum laborum veritatis voluptate deserunt autem enim accusamus voluptas aliquid sed ad consequatur. Porro veritatis quae et dolor et ipsa beatae quidem ut quia voluptates error iste neque;\r\nRepudiandae iusto et maiores adipisci dolorum ut aut quasi quos magni aspernatur aliquid nihil in. Ad eos voluptatum rem ratione autem et iste consequuntur iste earum qui eaque fugit iste! Omnis ipsam quidem facilis rerum ut neque sint est aut non officia a atque sit. Minus dolorem harum sapiente explicabo ratione placeat sunt qui omnis voluptatibus, ut ipsam aspernatur voluptas. Dolor quaerat sint vel sit dignissimos laudantium velit qui sed earum eum ut iusto aliquam. Minus pariatur et rerum eaque odit ea ad non sed quidem mollitia quasi deserunt ut? Perspiciatis tempore aliquid, dolores aliquam vel suscipit architecto voluptatem iste voluptas fugiat at maxime numquam. Atque sed quo quos doloribus, quia dignissimos temporibus repellat et hic neque temporibus quos est. Et sunt porro, impedit nostrum molestiae animi voluptatem autem quod enim vitae dignissimos quibusdam reiciendis. Asperiores ut quam, corporis autem architecto nostrum est cumque quia dolor sit distinctio optio enim. Ea dolorum totam alias quis natus, quia totam aut voluptatem ipsam unde expedita voluptatem itaque! Et ut quos mollitia officia et suscipit dolore asperiores cum quod praesentium possimus harum modi. Odit et ut perspiciatis omnis quia, aperiam est libero labore perspiciatis sint sunt omnis minus! Nostrum natus omnis aliquid aperiam aut repellat, ab adipisci eligendi odit sed natus distinctio eos? Fugit ipsum molestias, dicta qui est perspiciatis et sit nisi tempore sit et dicta veniam.'),
(10, '1976-09-27 13:01:11.500', 5, 'Nisi excepturi, sint atque et voluptatem laudantium sed inventore et optio qui et consequuntur a. Exercitationem ut sit et qui aperiam voluptatem numquam dolores soluta aut blanditiis perspiciatis voluptatum ipsum. Cum perspiciatis eius dolorem, commodi et quisquam officiis excepturi et ut corrupti tenetur et quas! Cum est sed id, nam porro architecto corporis porro laborum vel voluptatem enim ut accusamus. Ut cupiditate voluptas laudantium alias sit sint voluptate, est obcaecati inventore consequatur consectetur sint omnis? Iste autem optio doloribus quibusdam error ut accusamus eos ea rem voluptatum voluptatem et qui! Est error accusamus et doloremque enim qui ad recusandae sit repellat, ipsum quos error temporibus. Quae voluptatem rerum ad, accusamus fugiat labore aut provident iure odit iure sed in eum! Et magnam at quia tempore veniam voluptates cumque et, ut odit error sed voluptatem natus. Perspiciatis et perspiciatis, velit aut sint illum a ut eligendi officia laudantium sit a aut!;\r\nId commodi vel sed dolor amet ad blanditiis sed numquam sunt eos molestias accusantium modi. Est modi culpa, nesciunt voluptatibus in omnis aliquam est dicta sapiente iste aut eveniet et; iste impedit quos magni et ut ex expedita minima sed in nulla rerum laudantium velit. Et aut inventore officia, dolore unde quia laboriosam quis optio est maiores ut iste dolores. Nemo id nisi quia et nam ut quibusdam impedit excepturi error cupiditate assumenda sit et! Velit libero rem consequuntur placeat et consequuntur nulla quia illo repellat ut quis ipsum mollitia;\r\nTotam qui voluptatem omnis quos accusantium error est sunt eos et, neque beatae at iusto. Soluta porro ut reiciendis adipisci quia voluptatem perferendis qui fuga quam, voluptatem quae aut error. Facilis qui voluptatem optio labore voluptatem nostrum amet obcaecati ad dicta velit ab totam suscipit. Dignissimos autem veniam sint rerum sit aut ipsam voluptas molestias vitae ullam ut voluptates non! Dolores magni quas quis nihil sapiente maxime distinctio veniam consequuntur ut quam non accusantium ad. Iure necessitatibus, voluptatibus et eaque consequatur quia id sit consequuntur quo omnis non est perspiciatis. A ullam nobis autem minus et natus sed adipisci numquam laborum nesciunt sed natus repellendus! Totam iste voluptatum animi ea voluptas beatae totam, laborum tenetur a neque eligendi accusantium veritatis. Esse consectetur cupiditate perspiciatis quibusdam accusantium, dolores minima voluptatem recusandae sed aut sapiente fugit voluptas. Voluptate quis molestiae deserunt aut ut ratione labore nisi dolorem nihil aliquid laboriosam rerum est. Labore eius rerum consectetur ea dolorem quia minima dolor ut saepe placeat qui excepturi sit. Qui accusamus nam autem ut odit et sed rerum veritatis alias, nesciunt asperiores voluptate dolores. Natus molestiae natus rerum laudantium sapiente sit id odio quidem et repudiandae sunt saepe magnam. Perferendis iste impedit aspernatur tempora dignissimos vero voluptate quidem natus error sunt earum voluptatem atque.'),
(11, '2001-04-11 04:51:52.410', 18, 'Ut minima voluptatum unde ut omnis repudiandae optio laboriosam natus maiores laboriosam placeat voluptatem nihil. Non asperiores quaerat enim et, aut tempora quia non optio fugiat dicta ea doloremque perspiciatis;\r\nReiciendis earum, sed distinctio perferendis saepe aliquam omnis doloremque enim repellat distinctio quia voluptas quis. Quae sed aut rerum blanditiis et ea eum qui et magni rem corrupti sequi odit. Fuga amet dolores nostrum, autem facere enim sint architecto iste sit odit ut iusto ut. Corrupti provident, facilis et architecto non fuga dolore ea velit doloribus fugit omnis voluptatem ullam. Labore consequuntur eos nihil quia ut aliquam optio facere sit veniam rerum ipsa recusandae aliquam;\r\nImpedit consequatur voluptas mollitia, et esse tenetur neque a facere harum sed rerum aut et. Reprehenderit nesciunt itaque inventore, sit repellendus repudiandae ut voluptas eos modi velit quaerat sed ipsum. Cum autem dolorem culpa eum quasi, laboriosam enim harum explicabo molestias quia error rem in. Minus similique vero exercitationem obcaecati aliquid sequi aperiam ipsum quos et doloribus cum ut voluptate. Sed deserunt numquam odit ut similique et, omnis consequatur laboriosam impedit voluptatibus et tempora unde. Quo odio ut nobis sit, eveniet ducimus corrupti voluptate distinctio voluptate voluptatem labore ullam sit. Facere sequi nam, corrupti molestias sit perferendis sed non delectus praesentium in perspiciatis quasi magni. Est voluptate adipisci est et saepe quibusdam quia aperiam aspernatur qui optio neque et deleniti! Ab vel est qui enim illo molestias et est corrupti voluptatem ut quia ad obcaecati. Placeat architecto recusandae beatae sit neque est, placeat voluptatibus qui eos veritatis quos praesentium enim. Fugit quam veritatis cum, aliquid similique illo laboriosam molestiae eum aut velit fugit qui iste. Repudiandae ducimus ipsam voluptatem aut sint adipisci vero saepe quia et repudiandae dignissimos vitae voluptas. Dolorem iusto est iste, saepe aliquam nihil natus omnis ipsam autem error laudantium consequatur tempora. Nihil repudiandae voluptates est sed esse dolore omnis harum et voluptatibus iusto maxime itaque sit? Perspiciatis non consequuntur in natus molestias ut unde, omnis architecto in nobis dolorem fuga et.'),
(12, '1997-04-30 01:49:15.080', 35, 'Omnis qui aliquid, aut velit omnis deleniti quibusdam est praesentium ut quaerat fugit non fugit. Nostrum eum consequatur aut est rerum minima officiis cum perspiciatis sit in quia incidunt unde. Ipsum nostrum impedit velit iste, voluptatum qui quia id officiis veritatis ea rem omnis fuga. Doloremque sit dolore unde et odio et dolores omnis nesciunt repellendus incidunt rerum facilis aliquid. Perspiciatis vero et laudantium maxime, autem aliquid quos ducimus iure provident voluptatem numquam quos sint. Odio enim ipsa commodi distinctio qui ut expedita, quibusdam suscipit quisquam id ipsam iure sit? Libero dolores et suscipit eos voluptas aut pariatur voluptas, et nesciunt non repellendus et consequatur; corrupti optio aut sit possimus aut inventore et aut, velit aut non perferendis et tenetur; non debitis sit repellat nostrum vero voluptatem nam commodi ut nam recusandae tempora sit facere; aut perspiciatis neque qui maxime itaque ratione dolor perferendis non aperiam quos facilis eveniet error. Voluptatum sit molestiae voluptatum necessitatibus iusto earum omnis mollitia amet impedit sed recusandae perspiciatis accusantium. Voluptatem ducimus nisi expedita accusantium libero ullam obcaecati sequi ut architecto illo aperiam rerum deserunt! Consequatur ut ipsa minima odit voluptatem quia, sed molestiae asperiores voluptatem neque omnis perspiciatis error. Ut quam, necessitatibus consequatur et dolore iste et laborum rerum voluptatem quibusdam eos in repudiandae; vel quaerat nemo error dolorem eius corporis molestiae voluptas non quaerat et qui repudiandae fuga. Est nemo ut perspiciatis accusantium modi et illo ut est tenetur iste omnis fugit officiis! Est voluptate non est voluptas et est commodi quasi exercitationem quos dolor odit excepturi labore; enim sit, consectetur sit velit et eveniet obcaecati qui magnam ut omnis rerum dolor quia;\r\nFuga odio blanditiis quod quia consectetur ea rerum quaerat perspiciatis incidunt ducimus eius harum nesciunt. Amet deserunt ea perferendis soluta explicabo velit odit et maxime quae aliquam quas aliquam ipsam! Optio deserunt minus ipsam minus quod non, odio nihil sed aut error in blanditiis necessitatibus. Voluptatem aperiam excepturi cumque unde aut veritatis tenetur harum tempora vitae et quia magnam saepe! Ducimus atque tenetur est voluptatem deleniti minus id nesciunt praesentium, omnis iure aspernatur necessitatibus quaerat. Vel in sit consectetur suscipit illum commodi ratione iste distinctio aut soluta dolores nihil adipisci! Nostrum qui et tempora debitis iste sed pariatur qui provident facilis quia omnis et nam. Id quaerat natus voluptas soluta, incidunt voluptates natus ut veritatis qui voluptatum aut deserunt sit. Officia natus ad maxime accusantium debitis soluta doloribus modi explicabo voluptatum pariatur inventore harum tenetur. Ipsam praesentium aut nihil aut autem, nesciunt sapiente et totam praesentium fugit dignissimos unde nisi. Facere itaque odio ut est repellat fugit impedit deleniti numquam pariatur vel sint aut dolores;\r\nMinus ullam ex sit non aspernatur expedita dicta consequatur voluptatem libero soluta dicta eum amet. Quisquam ut et illum omnis qui officia vel voluptatem sapiente ut, dolores atque earum et; tempora debitis ipsam minus molestiae voluptatem fugiat error consequatur unde sit iste dolorem qui rerum. Eos consequuntur omnis optio esse aliquam accusantium quis dolor commodi molestiae libero totam eos dolor. Et voluptatem iste rem sed adipisci impedit vel voluptas esse minima sapiente, adipisci reiciendis libero! Repudiandae recusandae qui aspernatur error assumenda unde nulla qui recusandae fuga aut fuga quia earum. Beatae voluptas exercitationem obcaecati illum pariatur nesciunt est quis quisquam, vero sed voluptates amet fugit. Obcaecati incidunt sequi assumenda facere veniam labore eum at iusto non dolore recusandae ducimus odio.'),
(13, '1983-03-10 02:15:53.810', 21, 'Ut sit dolorem molestiae assumenda voluptas velit non nemo repellat rerum ex animi voluptas tempora. Molestias harum optio perspiciatis id ut iure sunt quas eligendi aut laudantium quis voluptate sed; harum eos qui omnis, quibusdam non fugit omnis sunt necessitatibus ut mollitia velit ad dignissimos. Voluptas sed earum, est eaque labore quod odio iusto sit laborum eligendi non nulla minus. Natus laborum accusantium expedita, repellat quos aut itaque error ea qui voluptatum sit facilis omnis! Maxime labore, vitae praesentium maxime consequuntur autem aperiam voluptas ipsam animi dolorem eos repellendus rerum. Minima cum pariatur ut iusto cupiditate voluptates omnis dolorum nihil voluptatem ea eaque voluptatem sit! Vel quia perspiciatis dolorum animi rerum sunt nobis laudantium enim aut praesentium corrupti dolores rerum. Nisi voluptatem in sed quisquam modi sed porro dolor dolorem minima enim est eum deleniti. Iste qui alias amet animi tenetur sed illo ratione itaque natus voluptatem fugiat recusandae consequuntur! Est accusantium hic dolore modi iste dolor itaque cupiditate voluptatem consequatur debitis et perspiciatis quis; quo ad nostrum quisquam sit inventore omnis nemo molestias accusantium architecto commodi sapiente id aut. Labore sint possimus odio quibusdam accusantium repellendus iste ut aperiam totam voluptatem ut reprehenderit commodi. Omnis ut quo repudiandae est non illum beatae perspiciatis dolorem molestiae libero assumenda modi necessitatibus? Minima pariatur qui autem sapiente error et error qui et velit sed at sed nostrum! Et quod, eveniet aut aspernatur error nostrum velit aspernatur debitis similique nulla sit eos illo. Voluptatem beatae, perspiciatis voluptas dicta et deleniti autem sunt id quam sint facilis quia nesciunt. Accusamus nulla consequatur sit inventore dolorum veniam ipsam non laboriosam error odit unde velit in;\r\nDistinctio vel numquam nesciunt, sed dolorum dolorem ratione unde sint dolorem accusantium est voluptatem inventore. Ea ipsam sequi excepturi, minus eum quis earum non omnis vel quam qui non ut! Omnis vel mollitia, qui ea amet qui omnis possimus ullam qui consequatur molestiae magnam natus. Atque unde autem soluta rem et quia autem aut ullam ea qui eius asperiores molestiae! Amet et nihil sunt accusantium voluptatem necessitatibus tenetur ipsam consequuntur omnis cumque suscipit aliquam sit. Laudantium id aut eos itaque enim omnis at molestias ut sequi deserunt necessitatibus labore architecto! Consectetur commodi qui necessitatibus quod eius consequatur qui illo dolore ex non iste natus qui. Nihil a molestiae placeat eaque qui iste fugit quam fuga sit molestias molestiae numquam ea! Qui earum odio repudiandae reprehenderit quia aliquam fuga natus voluptatem ipsa quas perspiciatis ipsum qui;\r\nQui dignissimos sed quam laudantium ipsa est vel, amet accusantium doloribus eos inventore quae voluptas. Quibusdam nemo eum saepe eius, explicabo omnis quia nulla quia minima non maxime quo fugit? Consequuntur enim ad iste reiciendis qui, ipsam a velit natus illum consequuntur voluptatem dolorem sapiente. Praesentium ad illo blanditiis aliquam qui quaerat voluptas fugiat ducimus et deleniti optio quo laboriosam. Modi fugiat consequatur, sit veritatis culpa deleniti et enim ipsam veritatis molestias illum porro voluptatem. Est sed in et perspiciatis obcaecati consectetur quasi ipsa cum et cumque aut omnis voluptatem. Voluptatem beatae autem ut et sint est cupiditate quia labore alias nemo placeat inventore non. Et ut hic blanditiis eligendi odit unde non et ut id, praesentium tenetur sit in! Iste ut vel error ullam, eligendi quia ratione sed ipsam cumque dolor dicta ut beatae? Sit ut voluptatem necessitatibus, fugit hic quidem aspernatur id ut assumenda et voluptatem sit nobis. Ea libero veniam sit possimus facilis a quo vel necessitatibus aut eos quasi harum reprehenderit...'),
(14, '1984-06-14 01:56:58.990', 3, 'Quibusdam sed atque libero ex earum, eum earum dolores modi laboriosam ex error deleniti nobis. Perspiciatis molestiae perspiciatis tenetur minus autem nesciunt sequi nesciunt perspiciatis nostrum ea ipsa dicta odio. Eum illo et voluptatibus velit exercitationem dolorum iure consequatur, excepturi neque facilis quia magnam sed. Repellendus eligendi, aut quibusdam vero voluptatibus omnis optio sed temporibus asperiores possimus omnis cumque sed? Necessitatibus nisi dicta iste possimus sit, accusamus natus hic voluptas nesciunt ipsa ut id alias! Adipisci repudiandae aliquam, voluptatibus minima deserunt id dicta in quia iste magnam ea inventore alias? Et iste modi est aliquid ex non voluptatem nisi quia esse et commodi in iste. Et blanditiis ut dicta nihil aspernatur unde nobis quaerat voluptatibus officia suscipit minus voluptatem voluptatibus. Officiis delectus voluptas natus error quasi et aperiam itaque quo iure numquam sit maxime quis? Nihil dolor quos aperiam non optio hic libero aliquam itaque sint modi fugit mollitia cupiditate. Commodi et, sit modi commodi illum nam ratione architecto sit beatae omnis non et quisquam! Ducimus sapiente deleniti ut sit omnis et quo quia harum qui suscipit atque in dicta. Sit quidem incidunt amet autem sit, corrupti quo amet minus placeat mollitia numquam natus non! Eaque ipsam laudantium animi voluptas iusto illum quaerat nesciunt reiciendis ut nulla impedit officiis laudantium. Aut veniam voluptas velit laudantium eos debitis ipsam qui suscipit ut rerum odio dolorum ratione. Architecto rerum, minima dignissimos est quam cum voluptate quam doloribus quis adipisci est exercitationem et! Est iste, quaerat fugit perspiciatis explicabo quo deleniti quae officiis perspiciatis eligendi perspiciatis sint consequuntur;\r\nSit natus soluta nihil omnis et quisquam sit voluptatem est illo iste hic et laboriosam. Dolores odit ex voluptatem commodi placeat unde enim debitis sit vitae quam assumenda voluptatem consequatur! Voluptatum cum quis modi eaque in itaque voluptas voluptate porro unde perspiciatis in ex consectetur. Cupiditate hic, voluptatem placeat earum rem mollitia aut sapiente sit autem rerum voluptate eos inventore. Perspiciatis reiciendis magni rerum cumque ut, explicabo reprehenderit non at aut corrupti placeat eos reprehenderit! Sequi accusantium ad veritatis modi cum impedit blanditiis itaque provident eligendi nobis est tempora eos. Et unde, consequatur debitis a tenetur natus veniam rerum natus similique officia deleniti error natus. Est eum itaque ut omnis eos quasi voluptatem veniam voluptatem eligendi et animi debitis modi. Ipsam sequi omnis et ut modi odit tenetur laborum enim animi et recusandae qui et! Possimus quis ipsam molestias velit cumque accusamus cumque dolorem recusandae dolore voluptatibus omnis iste aliquam.'),
(15, '2014-01-20 04:10:37.410', 4, 'Est et ipsum quas sit eius soluta et sint optio minima natus explicabo id aut. Accusamus quos delectus voluptatibus ut aliquam necessitatibus iste omnis eos voluptatem optio inventore fugit eos; aut recusandae, dolore qui architecto rem nesciunt labore molestias iste ex aperiam culpa neque vitae. Eum quisquam doloremque vitae aspernatur sed nulla eius nihil et blanditiis et ut ea aliquam? Exercitationem molestias consequatur quidem optio aliquid doloribus iusto eos et alias aut aspernatur fugit sunt. Quo sed nemo suscipit, officiis enim laudantium vero vel qui quia cupiditate quasi fugit sunt;\r\nQuos id sed eveniet maiores, voluptatem minus dolorem nemo aliquam rerum fuga unde sequi debitis;\r\nIste eius aliquam sunt magnam quia fugiat natus qui modi enim et illo et nisi. Facere sed architecto animi natus nesciunt consequatur, laboriosam qui quod necessitatibus sint neque quia et. Aut est nostrum, similique ducimus inventore eum maxime est recusandae ullam doloremque dolor molestiae temporibus. Nulla a officiis unde nobis ut, error sit architecto explicabo in eius tempore non aut. Molestiae commodi et quia, corrupti quia est voluptas blanditiis facere ut omnis est soluta accusantium. Qui consectetur et dolor labore earum ducimus aperiam debitis est nobis vero, porro similique in? Et quasi aut est quos qui soluta itaque est ipsum tempora veniam porro corrupti veritatis; minus voluptatem odit ut qui quo deserunt dicta quisquam quo natus cum sed aut recusandae? Provident perspiciatis tempora perferendis est temporibus impedit explicabo eius et at ut voluptatem quia similique! Voluptatem distinctio laborum ut numquam omnis molestiae blanditiis maiores corrupti qui corporis dicta nulla atque. Delectus est qui nesciunt quia velit eum velit aut asperiores earum quia quam repellendus qui. Omnis rem, beatae et enim quia quas exercitationem nobis animi blanditiis sit eos quis est. Modi et aut natus quaerat natus quis doloribus ea ut aut consequatur quia praesentium repellendus. Veniam et sunt at blanditiis eos omnis voluptatem inventore qui optio commodi cum corporis rerum. Et numquam nihil non consequatur sunt ducimus qui, molestiae natus omnis qui deleniti possimus quia. Veniam ex et adipisci dolores iure nisi quia autem vel placeat officia minima ipsum nihil. Officiis architecto sint, vitae quam aut consequatur repudiandae at cumque esse officia quis cupiditate quasi! Doloremque dolorem vero molestias, aliquid veniam nesciunt neque beatae ipsam non dolorem unde optio esse. Autem aliquam aspernatur nemo laudantium, quos qui rem sunt vitae quae voluptatum dignissimos veritatis nostrum? Necessitatibus provident nihil et voluptatem pariatur est aut est voluptatem autem sit dolores necessitatibus illum.'),
(16, '1998-11-21 10:21:26.380', 44, 'Quisquam perspiciatis, magnam rem numquam distinctio deleniti voluptatem veniam recusandae autem dolores perspiciatis numquam dolorem. Voluptatem iste, rerum asperiores sit sequi eius eos sint omnis sequi unde pariatur voluptatem rerum. Eveniet natus, officia ex consequuntur ut commodi id maiores qui porro dolorem est excepturi laborum. Veritatis et sunt et corporis unde tenetur iste placeat omnis dolores omnis sit voluptas in. Minima iure illo recusandae et, tenetur sint omnis dolorem aut rem itaque ipsa est ut? Quisquam qui ex sit est velit labore natus aliquam enim et magnam qui totam voluptatem. Exercitationem vitae et ducimus similique praesentium unde dolore odit voluptatem nostrum sint et tenetur ut. Dolorem dolores, delectus reiciendis et sit repellendus delectus error voluptas dicta quibusdam sed reiciendis et. Rerum sed excepturi, omnis perspiciatis ab nam harum aliquid molestiae maxime velit aut voluptatem voluptate! Aliquid maiores omnis id suscipit molestiae omnis necessitatibus molestiae laudantium est sed eos sit laudantium. Nihil ipsa repellendus quibusdam dolores labore consequatur iste unde in alias et voluptatem voluptatibus itaque. Expedita non iure, mollitia molestias dignissimos ut maiores ea dolorem vero reiciendis consectetur architecto consectetur! Quia maxime tenetur, ipsa id ad ea amet quod debitis odio voluptatem natus laborum unde. Qui natus consectetur sint quas vero dolores nobis velit ad quidem saepe voluptas nesciunt eos? Iste voluptas perferendis, dolorem perspiciatis maxime excepturi qui sit fugiat aut et vitae blanditiis ut. Quaerat impedit sint id et accusantium, enim explicabo sed facilis omnis enim voluptatem sed et? Laborum aut odio ut sed quas nam non consequuntur sapiente laboriosam dicta perspiciatis sed velit; aut impedit sit error, exercitationem aut explicabo cumque necessitatibus voluptatem doloribus porro et eum doloremque.'),
(17, '2010-09-24 07:45:09.950', 36, 'Qui omnis, a molestiae consequatur minus et optio facilis ad dolor ipsum ratione porro est. Quis sint ut, possimus odit deserunt aut dolor sint dolore et sunt quasi quisquam sint. Minima facere natus facilis nihil sed nostrum sed repudiandae sit corrupti inventore cum fugiat consequatur. Tenetur rem velit praesentium eos ut enim consequatur aspernatur voluptatem et qui totam aut ipsa! Et voluptatum voluptatibus corporis, cum et libero qui est consequatur nulla consequuntur et est ab. Modi magnam totam est sit fugiat in sed sit inventore laudantium id natus est dicta. Quo porro corrupti in reprehenderit et at fugiat voluptatem ad voluptatem ea ratione quo aut. Accusantium nesciunt fuga autem iste perspiciatis tempore aliquam eum repellendus alias quae a cum ut. Pariatur velit dolores, quisquam magni consequuntur eos et voluptatem omnis sed error quia sunt ipsum! Obcaecati sint qui quo ratione labore sapiente eum sapiente placeat et nemo est, quos optio;\r\nSit omnis unde, dolorem consectetur sed cum ut vel architecto at consequatur iure debitis eaque. Sit fugiat, voluptate vel minima maiores consectetur nisi eaque dolore voluptatem tempora assumenda quisquam quia. Autem nulla velit repellendus et pariatur sed non nesciunt dolor obcaecati sunt reiciendis sunt blanditiis; sunt quia dicta voluptas aut est voluptatem dolores ipsam alias sapiente dolorem illum nisi doloribus. Corporis recusandae possimus molestias natus dolorem nihil nobis, quisquam vitae vero eligendi ipsam rerum ut. Non dicta necessitatibus sed quidem maiores at ullam asperiores rem ducimus consectetur odio quam tempora! Repellendus ex, corrupti consequatur delectus voluptates distinctio eos et sit qui ratione sit id exercitationem? Consequuntur hic nihil esse ut commodi soluta sequi consequuntur consequatur ex, veniam consectetur enim dolorem.'),
(18, '2002-11-22 07:29:52.170', 42, 'Id sunt harum adipisci id illum voluptatum quidem, ut quia omnis placeat rem in veniam. Quis rerum blanditiis laborum voluptas reprehenderit ipsum quibusdam quo quia sed magni omnis sapiente iure. Cumque qui ut molestiae cum voluptatum, rerum possimus ut sed ut error est et nisi; aspernatur porro facilis in ut omnis alias quo, ipsum eos iusto harum vel voluptatem mollitia. Consectetur perferendis et explicabo aut molestiae illo voluptatum totam omnis quia ab, cupiditate numquam quia; suscipit et atque culpa itaque reiciendis id sit qui et ut ipsam architecto odio et. Ipsam consequatur ut et quia ad nam ut omnis libero labore molestiae quo similique assumenda.'),
(19, '2002-01-17 07:47:48.700', 39, 'Vero alias, aut omnis aut perspiciatis asperiores autem blanditiis magni obcaecati dolores est sapiente enim. Rerum et veritatis minima aliquid unde, impedit omnis rerum velit ea voluptas fugiat modi dolor! Aperiam sed ipsa delectus qui est sed odit et doloremque ea libero pariatur molestiae quasi; ex harum fugit optio error possimus sed id non quos sit asperiores dolore aut expedita. Illo sit autem modi, ab reprehenderit consequatur est ex quo quidem error laborum in sint; ut nulla voluptas incidunt placeat eaque voluptatem vitae repudiandae laudantium totam quia voluptas sequi doloremque. Nobis totam laboriosam aperiam voluptatum sit quo et aut explicabo exercitationem ea modi dicta vel. Ipsam et corrupti non aut quis animi possimus omnis sit at sit qui dolore illum. Aspernatur nobis tempore ut dolor aliquid consequatur, harum rem provident unde dignissimos pariatur odit rerum! Expedita dolorum, commodi est sint deleniti quo illo consequatur aut blanditiis ipsam vitae quos in. Qui dolorum inventore dolorum error voluptate vitae dolore numquam rerum possimus consequuntur, quidem blanditiis eos. Autem officiis ab, iste quia eum iure nobis ea sit cum et fugiat beatae ut! Error id voluptatem eius officiis necessitatibus recusandae, quisquam repellendus sit libero aut qui beatae aperiam. Quisquam facere molestiae aperiam molestiae mollitia praesentium voluptatem sit tempora neque quasi atque quos maxime! Dicta nulla iure omnis mollitia fugit, in minima ratione aut ut obcaecati voluptates veritatis suscipit. Voluptatem sit qui voluptatibus rerum commodi earum unde illum soluta reprehenderit voluptatem obcaecati nulla aut;\r\nEt iste iure obcaecati aliquam ipsa eos quas distinctio facilis natus quo sed reprehenderit voluptas. Et non fugit omnis voluptate quis repellat qui ducimus sed minima in voluptas mollitia est. Harum consequuntur ut sapiente, vero cumque aut necessitatibus odit sequi iusto vel et iste molestiae;\r\nPerspiciatis et debitis qui quia molestias qui asperiores similique rem eligendi veritatis eos quos dolorem.'),
(20, '1976-08-30 15:34:20.490', 29, 'Perspiciatis dolore commodi a laborum sed unde quaerat qui eligendi odit vitae quo delectus quisquam.');
INSERT INTO `history_orders` (`id`, `date_create`, `order_id`, `description`) VALUES
(21, '2015-10-16 09:50:24.170', 44, 'Sit accusamus aut fugit, et ducimus et fugit velit repellendus ea eveniet iusto unde eius. Ut error dolores iste doloremque ut a dolore at unde qui dolor obcaecati delectus quas! Sit alias corporis quia maxime perspiciatis, voluptatibus qui voluptates itaque impedit reiciendis et ullam sed. Quo iusto distinctio voluptatibus ducimus sunt unde ad harum autem perspiciatis ut rem ut corporis! Tempora itaque veritatis explicabo assumenda culpa doloremque neque voluptatem dolorem tenetur et ut exercitationem ut; fugiat voluptate incidunt nostrum dolor, ipsa quam culpa maxime porro tenetur assumenda neque enim qui. Error sapiente, ea voluptas iure perspiciatis quos cupiditate asperiores odit voluptate aut nisi sit et. Est sed, in minus et ut vero debitis voluptatem excepturi ut reiciendis aut id est. Ut quod ut ex aut, culpa reprehenderit totam accusamus dignissimos tempore repudiandae consequatur quasi sit!;\r\nEt nobis sed blanditiis sequi magni non harum sed incidunt ab libero enim porro voluptatem. Sunt voluptatem officiis sed quia sed et repellat quia voluptate tempora voluptas vel rerum sit. Sed corporis ea maxime molestias vero quia nemo quo consequatur ut excepturi sit sed sit! Commodi incidunt, optio magnam dolor ea aliquid pariatur eum ut ea quasi tempore delectus quia. Est et rerum et accusamus perspiciatis, aut sit et tenetur odit voluptas impedit quisquam dolores! Modi ut, est dolores magni deleniti aut rerum aperiam veritatis hic in natus repellat et. Maiores vitae aliquid velit sunt quae, error sed in fugit accusantium dolore aspernatur tempore error! Aut dolorem, est nemo esse non enim natus non libero in voluptatem aliquid possimus esse. Eveniet voluptatem consequatur sequi voluptatem voluptas minima natus in dolorem molestias reprehenderit libero enim impedit. Modi expedita ut exercitationem ullam accusantium, natus perspiciatis delectus quis commodi a saepe eos error. Culpa totam assumenda tempore laudantium facere eaque eos et ut perspiciatis dicta recusandae aut ullam. Accusantium laudantium nulla corrupti ad et magnam exercitationem error illo impedit quis natus ut et? Consectetur saepe rerum repellat labore voluptate omnis corporis cupiditate voluptatem praesentium repudiandae impedit quasi unde! Iste corrupti reprehenderit, ratione et at autem unde dolore voluptatum et ullam aut ut et; sed quasi qui, non ut fuga labore sint est consectetur autem quas et eius debitis. Et libero consequatur minima repellendus voluptatum sit quia rerum et minima harum dolor harum unde. Fugit aut sed, maiores eligendi ex cum rerum quis nihil et tenetur alias ut assumenda? Molestias non sint perspiciatis dolorem nesciunt pariatur perspiciatis et aliquid quo exercitationem omnis dolore qui;\r\nLibero sit ab exercitationem, sint dolorum iste autem sunt tempora natus qui numquam libero perferendis. Aut illum enim, expedita libero autem unde dolorum dolorem neque deleniti quo laborum sint magnam. Nesciunt omnis est perspiciatis ut, expedita qui ad ut iusto quia illo at eos commodi; omnis nisi, dolor voluptatem aspernatur saepe nulla consequatur perspiciatis sed alias aut pariatur et molestiae. Quae dicta autem et eveniet, sunt facere fuga harum ducimus ea incidunt aut sed quis.'),
(22, '1983-02-23 16:43:18.670', 13, 'Eum magni, eius itaque id qui accusamus aut sit ea non aliquid nihil ratione voluptatem. Dolores sit iusto quae doloremque labore accusantium omnis accusantium quo pariatur consequuntur eligendi ut quam. Qui nostrum ipsam quidem quibusdam sequi aut quos ratione labore mollitia quo dolorem est velit; ullam similique officia libero ipsum voluptatem laborum doloremque qui consectetur labore odio laboriosam reiciendis quae. Voluptatem aperiam enim voluptatem quia error inventore temporibus natus corrupti iste est recusandae omnis veniam. Inventore et, incidunt nisi excepturi eos ipsam nulla voluptatem expedita cumque distinctio quia aut adipisci. Necessitatibus non voluptatum repellat, sunt ullam quidem voluptatem a et natus dolores a et ut. Et quae ut aperiam tempora ut et sed nobis, quis neque minima natus officiis voluptatem! Assumenda hic error et unde nulla natus aut nam error quod ipsam quidem reiciendis quo. Veniam dolores eos, modi voluptatem nihil unde autem voluptatem est aliquam modi officiis cumque quod. Sapiente voluptas accusamus odio aut eum iure sint enim ut delectus molestiae ipsam consequatur maiores. Doloremque fugiat, quis velit voluptatem sit voluptate ut optio quibusdam laudantium natus asperiores a enim. Minima asperiores necessitatibus sit dolorem iste animi magnam ad vel sint aliquid sed voluptas rerum. Quibusdam veniam ab consectetur, quia officia illo accusantium deserunt quia neque suscipit labore quam accusantium. Error itaque nihil corporis error nihil voluptatem est hic et ipsa quam assumenda nam quis;\r\nAlias animi aut omnis sed laudantium doloribus perferendis iste dolor praesentium dolorum possimus et repudiandae. Ut pariatur optio maxime pariatur sed, exercitationem modi aut nemo aut dolor eos voluptatem id. Soluta tempora quasi qui minus cupiditate et quos dolor exercitationem et tempora consequatur magni officia;\r\nFugiat laboriosam sit et debitis, expedita omnis eos vel quis ut non aut reiciendis quasi. Quibusdam excepturi laborum iste ad eveniet quis sit est qui tempora ut incidunt rerum in. Atque neque dolor officiis cumque sed totam natus illo sit iste odit placeat quisquam incidunt. Totam vero voluptatum quidem quia unde doloremque nobis voluptatem ut et expedita voluptatum tempora libero. Perspiciatis voluptatem expedita et, corrupti voluptas natus voluptatem omnis sit omnis et neque nostrum sunt! Libero quia facilis qui aut qui sed consectetur voluptatem omnis et magni aliquid dolorem consequatur. Qui non autem eligendi iste provident sed qui optio itaque consequatur ipsa beatae nihil est? Iure corporis omnis est a et natus dolore, ad tempore quod omnis minus eius quaerat; sit ex et quam dolores eveniet aspernatur error laudantium accusamus rerum mollitia quia ut deserunt. Natus cumque vero obcaecati officiis, voluptatem accusantium iure impedit et qui sed vel voluptatem iusto. Qui quisquam reprehenderit nisi, quibusdam sequi fugit quam at sunt veniam sit a sed libero. Quidem possimus quia et reiciendis sit modi aut, fugit et explicabo repellat odit veniam eligendi! Adipisci dolorum quibusdam natus qui mollitia ea harum eius illum rerum laborum asperiores sunt corrupti.'),
(23, '1993-08-19 19:33:53.810', 31, 'Totam nobis quam numquam sint tempora beatae culpa fuga dolor enim quia nostrum esse modi. Iste ut, est natus molestiae optio at iste minus amet voluptates odit aut veniam accusantium; iusto qui ut sint omnis laborum est totam voluptas saepe nihil facere quod cumque ducimus. Amet neque error cumque sed officia velit quos delectus voluptatem error iusto quam error fugiat. Ut deserunt aliquid debitis repellat omnis est repellendus omnis similique earum a aspernatur ad dicta. Soluta aspernatur rerum sit explicabo excepturi perferendis fugit distinctio in quia, culpa saepe perferendis exercitationem. Excepturi ab nihil omnis quis officiis explicabo natus quia sint quis voluptates voluptas aut illum! Sit aut sit, quaerat rerum exercitationem dolor impedit hic et molestiae aut blanditiis qui sed;\r\nQuia suscipit voluptas, cupiditate optio dolores assumenda voluptatem voluptas mollitia odit magni non magni voluptatem. Amet quo nisi voluptatem veritatis quis rerum sapiente ut voluptatem provident perspiciatis voluptatem et accusantium. Quia magni quia consectetur sit error animi quis vel autem non molestiae earum quasi consectetur. Officia quis veniam dolorum maiores voluptatem mollitia recusandae unde sunt perspiciatis, dolor non ullam ut. Laboriosam unde neque aut amet praesentium unde ut distinctio ut ratione enim non autem qui? Eaque sed, molestiae labore omnis officiis ut quis suscipit deleniti rem maiores laudantium error eos. Laudantium adipisci facere mollitia repudiandae modi, velit voluptatem sit saepe suscipit quisquam quod quia veritatis. Delectus dicta ipsam doloribus et sit dolores sunt ut quam debitis officiis veritatis qui quibusdam. Et sit dolor sequi ut omnis beatae magnam error, accusamus laudantium perferendis inventore commodi sed! Voluptatum iusto, illo nobis ullam omnis vero voluptatum voluptatem et iure repellat sit et architecto. Id sit obcaecati atque unde dolor qui quidem inventore dolores ullam ipsa voluptatibus officia ut! Ut qui sunt nam rem reprehenderit vero voluptas inventore praesentium sunt repellat maxime eius explicabo. Accusantium pariatur consequatur sit incidunt velit quas eum officiis qui, aliquam dolore sunt excepturi et? Officiis laboriosam amet, ut unde ab at unde sit numquam omnis explicabo id corrupti sequi! Repellat rerum, et praesentium ea iure tempora ut sint officiis pariatur qui deleniti est vel. Repudiandae vel natus porro suscipit voluptatem odit culpa, iusto perferendis voluptatem qui omnis ipsa aut. Illo unde qui sapiente quia sed voluptate numquam voluptatem asperiores in ipsam est ut perferendis? Natus voluptas dolore maxime qui veritatis voluptatem labore ut error velit sed, rerum sit quibusdam.'),
(24, '1998-11-19 21:44:23.720', 32, 'Et eius esse non delectus, rerum error reiciendis similique eum vitae labore natus illum quia. Et error asperiores ratione aspernatur ea quam, rerum natus nemo repudiandae sit quis consequatur iste. Nisi soluta fugit, sint consequatur odit nisi vero sed eum eos error autem quia expedita. In et iste fuga ut in ullam molestiae cumque quo aut earum aperiam autem qui. Sed eius in quo accusamus ea veniam sed, et amet accusantium aut qui libero quia. Dolorum fuga illo suscipit voluptas voluptatem necessitatibus at vel accusantium et sit aut dolorem dicta;\r\nSed est non ipsam dolore ea consequuntur eum animi porro quae eum sed quia est. Ea praesentium rem sit voluptate, vel aut voluptas beatae libero quia assumenda eos earum sed! Odit fuga et aut mollitia aut quia voluptatem rerum aspernatur fugiat omnis quasi ratione eos. Voluptas sit aut amet velit voluptatem dolorum blanditiis voluptatem mollitia quia error et in placeat. Excepturi perferendis obcaecati et, sed ut excepturi voluptatem quae nemo ratione non sint enim omnis! Labore possimus nulla unde quisquam sapiente incidunt voluptatem rerum sed omnis minima facere inventore vel;\r\nOmnis eos commodi ut, pariatur ipsam minus ab et id illo mollitia qui recusandae qui; ipsa sed consectetur quasi labore minus laborum error, velit aspernatur natus eveniet sapiente architecto nulla. Aliquam voluptate qui aut hic non nesciunt nostrum nemo sed rerum omnis et eveniet ea! Cupiditate itaque voluptatum et voluptas quae, fugit aliquam in unde nisi reiciendis cum praesentium id. Suscipit iste accusamus unde vitae voluptatem nihil iusto ut veritatis modi perferendis consequatur veritatis ut; cupiditate ad harum et asperiores natus molestiae sunt quas tenetur corrupti omnis commodi voluptatem culpa.'),
(25, '1985-02-14 14:13:57.370', 2, 'Suscipit id est natus recusandae corporis sunt repudiandae rerum at voluptatem et quis eius voluptatem. Voluptatum reiciendis repudiandae quas eaque sit reiciendis repudiandae similique iste repellat et sapiente voluptatem explicabo! Qui unde, esse facere ea nobis reiciendis vitae veritatis enim dolor consectetur at molestiae iste? Quis natus molestiae qui veritatis sed laborum veniam officia, consectetur nobis voluptatem quod perferendis atque. Molestias aut nisi mollitia velit ut, est quis porro ut ad ut dicta nisi iste. Voluptas aperiam consequuntur libero natus magnam dolor consectetur quisquam aut in nulla officiis ullam quis; quo nemo iste quaerat corrupti iste natus necessitatibus quo dicta iste ut quia ut cum. Sint omnis eos quis ut tenetur dolore aut qui quam velit quisquam labore sunt consequatur.'),
(26, '2020-02-24 16:41:53.900', 39, 'Aspernatur incidunt beatae laudantium in qui vitae vel unde, obcaecati rem autem vel numquam est;\r\nNumquam et officiis illo corporis ut fugiat libero dolorem voluptates, voluptatem atque aut accusantium molestias. Reprehenderit debitis magnam sunt nulla unde cupiditate qui sit ipsum voluptatem autem natus beatae dicta. Quo dolores, rem dignissimos consequatur id eaque corrupti id repellendus qui assumenda voluptatem maiores ipsam. Exercitationem qui non repellendus quas soluta qui molestiae perspiciatis nobis quia dicta perferendis sed eum; sit deserunt deleniti sunt, molestiae unde tenetur ut provident obcaecati molestiae natus tenetur pariatur et. Libero perspiciatis accusantium ea quia illo quae recusandae qui quam qui possimus vel tempora eaque. Aut ea, consequatur eos iste consequatur voluptas non necessitatibus delectus et ea consequatur ut magnam! Beatae dolorem fugit id soluta sed iste unde neque vitae illo rem, consequatur omnis laborum; officia natus molestiae magnam sint dignissimos est non aut cupiditate dolores iste dolor repellendus consequatur. Blanditiis perspiciatis aut minus saepe nisi eveniet eius ut suscipit ex eos autem nulla placeat! Ipsum omnis laborum fugit laudantium perspiciatis, et in fuga adipisci officia ratione accusamus vel architecto. Illo omnis distinctio quia animi velit repellendus enim sed voluptatum iste suscipit sit aperiam velit? Minus sed corporis natus nesciunt reiciendis et eum omnis sit ipsam et nisi omnis est. Veniam laboriosam aliquam voluptatem qui non totam aut inventore cumque nisi cumque, et molestiae illum! Optio quia et illo sit, explicabo eos alias sed ut voluptatibus facere error eos sed. Soluta accusamus rerum laborum veritatis voluptate deserunt autem enim accusamus voluptas aliquid sed ad consequatur. Porro veritatis quae et dolor et ipsa beatae quidem ut quia voluptates error iste neque;\r\nRepudiandae iusto et maiores adipisci dolorum ut aut quasi quos magni aspernatur aliquid nihil in. Ad eos voluptatum rem ratione autem et iste consequuntur iste earum qui eaque fugit iste! Omnis ipsam quidem facilis rerum ut neque sint est aut non officia a atque sit. Minus dolorem harum sapiente explicabo ratione placeat sunt qui omnis voluptatibus, ut ipsam aspernatur voluptas. Dolor quaerat sint vel sit dignissimos laudantium velit qui sed earum eum ut iusto aliquam. Minus pariatur et rerum eaque odit ea ad non sed quidem mollitia quasi deserunt ut? Perspiciatis tempore aliquid, dolores aliquam vel suscipit architecto voluptatem iste voluptas fugiat at maxime numquam. Atque sed quo quos doloribus, quia dignissimos temporibus repellat et hic neque temporibus quos est. Et sunt porro, impedit nostrum molestiae animi voluptatem autem quod enim vitae dignissimos quibusdam reiciendis. Asperiores ut quam, corporis autem architecto nostrum est cumque quia dolor sit distinctio optio enim. Ea dolorum totam alias quis natus, quia totam aut voluptatem ipsam unde expedita voluptatem itaque! Et ut quos mollitia officia et suscipit dolore asperiores cum quod praesentium possimus harum modi. Odit et ut perspiciatis omnis quia, aperiam est libero labore perspiciatis sint sunt omnis minus! Nostrum natus omnis aliquid aperiam aut repellat, ab adipisci eligendi odit sed natus distinctio eos? Fugit ipsum molestias, dicta qui est perspiciatis et sit nisi tempore sit et dicta veniam.'),
(27, '1990-04-27 03:04:44.660', 42, 'Nostrum dolorem ullam eum numquam quo neque ex reiciendis, quo tempora quo sit doloribus vitae. Consequuntur incidunt quam iste, aut suscipit nulla numquam qui et sit aliquam reiciendis quo recusandae. Molestias ullam, dolores velit nihil porro beatae nihil error nesciunt numquam quos eos hic natus. Voluptatem aut ut, quaerat voluptatibus fugit doloremque sequi vero dolorem unde non beatae explicabo aspernatur. Iste delectus in recusandae, omnis ut quisquam provident totam labore tempora voluptatem aut nam est!'),
(28, '2013-07-20 07:40:51.970', 40, 'Omnis cum eum enim omnis in est dolor, asperiores sit nulla dolore vero autem saepe; illo est sunt dignissimos quo necessitatibus, unde sed non voluptatem eaque delectus error possimus obcaecati. Sit error eaque ut repellat repellendus aperiam similique quo molestiae adipisci nostrum sit voluptatem sapiente. Unde eius error, voluptatem eius voluptatem facilis et quam vel ut excepturi ut aliquid neque. Maxime fuga totam et ea sequi, impedit ullam aut explicabo laboriosam saepe iste sit sint. Ipsa unde quam voluptas omnis consequatur facere recusandae voluptatem ut voluptatem est beatae est corporis. Iure fuga illum perspiciatis labore voluptate tempore a et error maxime dolorem ut quis soluta. Aperiam qui, voluptatum dolorem reprehenderit omnis rerum aut sit consequatur in sed adipisci magnam sapiente;\r\nIllo natus velit numquam cumque accusamus voluptas obcaecati, natus sed temporibus ex doloremque non excepturi; iste aut quaerat eos cumque et fuga consequuntur reiciendis cum ab deserunt consequatur provident vel. Nesciunt omnis quisquam aut est qui id, facere nulla reiciendis ut non atque perspiciatis ducimus; et natus sed est in ut fugit qui ut eligendi fuga omnis ad voluptates vel. Alias officia, blanditiis est provident aperiam eaque sed odit voluptatem sed quos voluptatem et qui. Sit recusandae quae dolorum quibusdam adipisci molestias cupiditate nobis velit molestiae eos voluptates maxime quod! Numquam praesentium suscipit autem sed sit nulla similique amet, dicta omnis et architecto non aut. Veniam sit quo repudiandae est omnis cupiditate omnis voluptas laudantium sequi illo sit consectetur rerum; doloribus nulla rerum perspiciatis tempore itaque ut laboriosam aperiam et quasi natus minus est perspiciatis. Dolore optio, nesciunt omnis minima corporis omnis veritatis dolores ut nemo qui perferendis vitae corporis. Minus magni quae placeat et corrupti eius quia vel molestias minus perferendis atque quia et. Non dicta omnis, sit quam qui quia explicabo est cumque quam sed iure atque in! Velit error laudantium nisi labore dicta excepturi, natus optio consequatur consectetur est delectus consectetur reiciendis. Dolorem perspiciatis id officia architecto consequuntur, rem ex nostrum ea quod totam earum ab nihil! Esse omnis error quaerat, dolorem quidem ipsam error omnis maiores quo aperiam eos non voluptates. Adipisci asperiores, facere omnis ut nulla totam aut error laborum eaque non dolorum ipsum ipsam. Nihil dolor neque consequatur fugit obcaecati error suscipit quod accusamus dicta suscipit iusto ab nam.'),
(29, '1975-02-14 19:47:39.590', 20, 'Itaque sit accusamus nulla omnis quasi accusamus obcaecati nihil rerum ut sit aliquid adipisci iste. Iusto voluptatum voluptas quibusdam iste optio provident a minus rerum sit provident ut sit unde. Ratione eius iure sint, laudantium eveniet temporibus nemo quo vitae eius pariatur recusandae aut dolor. Sequi cupiditate doloribus molestiae eius nostrum ad consequatur iste maiores dicta vel animi quia ab. Id temporibus dicta qui omnis dolores, voluptatem earum repellendus ea voluptas aut ullam odio deleniti. Error illo non et odio ut aliquid cupiditate ratione sit enim ipsum velit soluta optio. Quidem laborum inventore maxime quidem est sapiente ipsam vel quidem vel laboriosam dolor est non. In qui aut omnis reiciendis fugiat nihil et debitis pariatur iure quibusdam, totam fugit quia. Quis vitae assumenda distinctio omnis et sit sunt numquam sed sunt corporis minima veniam pariatur. Inventore id ut ullam asperiores aut maiores ipsa nemo distinctio, et unde necessitatibus doloribus omnis. Et mollitia eos neque quo nostrum facere aliquam magnam enim a quisquam rerum ut possimus. Itaque reprehenderit harum eveniet est rem ad voluptatem laudantium, nesciunt enim qui optio aliquid unde. Quis sed repellendus, nam dolorum quisquam dolore et nisi natus sequi voluptatum dolorem repudiandae sequi. Quae ea atque omnis non magni, eligendi quia commodi voluptatem omnis dolor quasi quo vel. Aliquid voluptatem similique eum omnis in voluptas accusantium temporibus perspiciatis iste facilis at sint labore.'),
(30, '1994-08-07 13:32:38.290', 10, 'Perspiciatis itaque distinctio illo dolores est tenetur sit consequuntur similique expedita consequatur in numquam quas. Nesciunt hic harum cumque veniam, harum perspiciatis aut ipsum architecto laudantium aliquid aut sit dolores? Adipisci neque saepe consequatur nisi laborum voluptatem qui magni rem ut sed optio ut incidunt. Architecto natus nemo ducimus et nemo rerum autem ut laborum quod sapiente est nesciunt officia. Sit inventore sed dolorem odio qui rerum omnis ut rerum libero vitae autem vero dicta. Amet quibusdam cupiditate dolorem asperiores totam dignissimos dolorum est voluptas ipsam molestiae quia perspiciatis ipsa. Voluptatem et sit qui ut fuga perferendis sint ab hic porro recusandae quo dolorum maiores. Deleniti unde ut aut ut nesciunt animi autem assumenda ullam magnam et repudiandae labore est? Et saepe veniam repellendus itaque qui quo consequuntur, commodi voluptatem quam atque quibusdam itaque dicta. Sunt fuga qui commodi amet quo quia nulla saepe voluptas consequuntur sed voluptatem doloremque sint. Omnis et consectetur minus dolores et quibusdam veritatis recusandae accusamus aperiam accusamus ut quod ut! Et quod, quibusdam nisi dolore beatae rem dolores ipsa et neque quam debitis expedita corrupti. Et blanditiis repudiandae voluptas velit expedita saepe doloremque laboriosam modi et quos quaerat voluptatibus vero...'),
(31, '1989-04-23 07:16:18.830', 18, 'Magnam accusamus et quidem quasi quae incidunt necessitatibus voluptas sunt quisquam impedit voluptas eligendi quisquam. Et esse necessitatibus nihil ipsa tenetur consequatur et modi est debitis ratione consequuntur repellat sed; dolor illo ratione aspernatur tempora ad quibusdam recusandae velit suscipit ut nisi aperiam ab ducimus. Et sapiente alias cumque quam velit alias ab voluptas at ea iste ipsum neque quasi;\r\nFacilis repudiandae architecto nemo qui consequatur voluptatum est ex repudiandae laudantium ea qui quia unde. Qui autem a fugit ut voluptatibus esse dolorem maxime et dolorem aliquam fuga et libero.'),
(32, '1970-12-02 23:57:53.210', 27, 'Beatae sunt, sit ducimus dolores eum alias repudiandae quia omnis earum ab voluptas architecto eum. Velit voluptas aut, culpa facere qui odio magni ducimus hic perspiciatis error laboriosam enim laboriosam! Asperiores sed magnam omnis perspiciatis sint corrupti unde atque accusantium excepturi eaque eum magnam dignissimos? Perferendis est voluptate, perferendis culpa vitae neque perspiciatis voluptatem quo sed iusto velit autem enim. Dolorum repellat veniam omnis quos perspiciatis officiis magni id odio sed numquam repellat voluptatem quia. Non enim, rerum ipsum assumenda nisi accusamus quis aut consequatur eveniet consequuntur eligendi fugiat sed. Enim odit aut libero et corrupti minus modi a sed eos tenetur omnis libero ducimus. Iste voluptas qui vel minus rem quo aut est nulla fuga in fuga earum atque! Incidunt quidem est enim qui, delectus distinctio illum ut animi sit id exercitationem ipsa est. Et doloremque at vel aliquam, aut ipsa sit vitae repellendus voluptatum exercitationem voluptatem tempora fugit; placeat omnis est nisi quidem illo soluta distinctio sapiente possimus rem et at beatae doloribus. Harum qui tenetur maxime quidem doloribus sit officiis labore ullam pariatur quasi est dicta et? Architecto voluptatem, ipsam et eius accusamus qui repellat non dolorem illo atque ut dolor aut! Consequatur sed tenetur aliquam omnis quo et expedita ex est id sit veritatis nobis voluptas;\r\nSunt est excepturi corporis excepturi voluptatem repellendus fugit cumque rem sint eos quia necessitatibus quia. Obcaecati voluptatem omnis cum nisi ut quam voluptatibus consequuntur incidunt cum, libero assumenda earum corporis! Porro ab, aut facere quo dolorem quaerat id quaerat quos error deserunt ipsum sed possimus.'),
(33, '2001-02-27 11:42:58.040', 4, 'Iste deserunt eos molestias error hic et corrupti eum omnis ut et nemo est a. Doloribus sunt et in perspiciatis, ea cupiditate mollitia voluptatum ex rerum omnis architecto ullam iste! Obcaecati minus ut dolorem magni iste ut exercitationem molestiae dolores natus impedit repellat porro reprehenderit. Eius molestias error accusamus sit et error quasi, aliquam necessitatibus ab eveniet voluptatem omnis ut. Omnis architecto aut, libero iusto ipsa quia aliquam omnis fugit repudiandae qui corporis aspernatur minus! Voluptatem consequatur non et quis ipsa et odio illum labore autem mollitia nisi omnis sequi. Et dolorem, minus sed ut cum eius ut magnam dolores deserunt aliquam sit sint ea. Veritatis ea culpa magni rerum qui perferendis in eum cumque voluptatem sapiente ex alias et. Doloremque sed ut sit in ullam quod commodi, accusamus et explicabo repellendus qui quidem optio. Repellendus quibusdam totam at id facilis nulla omnis, officia pariatur ex sit illo optio similique.'),
(34, '1977-09-08 02:18:07.040', 18, 'Repellat ab et aspernatur et dolorem perferendis ut incidunt a consequatur id non repudiandae enim. Saepe ut, corrupti ea nesciunt assumenda suscipit sed cupiditate aut sunt et perspiciatis itaque distinctio? Reprehenderit illum quia corrupti reiciendis voluptatem et ea voluptatibus explicabo voluptas maiores sint illum labore. Omnis pariatur, ullam distinctio incidunt ut aliquid inventore ut eius praesentium quaerat accusamus ut sit. Voluptatem earum atque harum eum ullam, nulla ratione corrupti asperiores sit saepe error aspernatur non! Repellendus sed, nisi autem est incidunt distinctio quia ad non nisi nobis et rerum et. Error ut consectetur velit iste eveniet, quas maiores id facere sit placeat aut ad blanditiis. Voluptatum ducimus sed, sunt omnis voluptatem reprehenderit omnis aliquam molestiae ullam qui perspiciatis unde vitae. Odio sit explicabo non, error assumenda repellendus quod libero praesentium fugit rerum voluptas sit eligendi. Eius quisquam natus corrupti dolores magni quae, qui labore obcaecati qui velit accusantium nobis nulla! Et labore suscipit repellat qui esse qui soluta et sit officia tempore ipsam quos repellendus. Aspernatur non ea delectus voluptatem iusto dolores ut repellat odit veniam tempora ipsam id exercitationem. Voluptatem repudiandae necessitatibus minus consequuntur necessitatibus est rerum, beatae rerum pariatur iste perferendis sunt perspiciatis.'),
(35, '1999-01-18 20:18:58.790', 47, 'Enim possimus incidunt perspiciatis et odit quos unde ab cupiditate nulla aperiam tempore laudantium voluptas. Voluptate perspiciatis a corrupti repudiandae, reiciendis enim sed excepturi nisi sed expedita impedit voluptas tenetur! Beatae nostrum illo quas magnam odit mollitia quod veniam voluptas et itaque voluptas nulla aut;\r\nMolestiae voluptatem omnis, aut sed libero perspiciatis et ut nemo voluptas unde architecto et unde. Doloribus facilis omnis architecto deleniti aut nobis et corrupti in dolores dolor non in qui. Exercitationem non, neque deleniti voluptatem est quidem fuga quae neque est ea aperiam voluptate vero! Error vero id eligendi officiis consequatur excepturi dicta aliquam quis iusto qui beatae culpa est. Voluptatem voluptas expedita at quia vero architecto, soluta aut minima qui eum totam ut unde; modi consequuntur qui ut, non inventore excepturi neque vel mollitia nihil aut blanditiis non dolores; officia sint deserunt alias porro saepe sunt assumenda, saepe qui molestiae sed qui sunt autem. Eligendi delectus animi quis excepturi voluptas, aliquam omnis sunt neque quasi officiis consectetur facere ea. Voluptates tempore voluptatem unde impedit dolor id asperiores unde rerum architecto aspernatur laboriosam libero quis. Veniam et accusamus voluptatibus et dolor, quisquam aut qui ullam dolores deleniti id rerum enim. Sequi dolor aliquid voluptatem dolor minima illo unde voluptatem mollitia non officia, qui quia dolorum. Quas optio aut eligendi nam culpa ex iste sint, nihil est vel cupiditate sit nobis. Ut enim, hic quod doloribus excepturi praesentium dolor similique sed inventore et ut ea voluptatum. Vel fugit rerum ad ut voluptatem non est quibusdam est dolorum soluta impedit mollitia nesciunt! Ullam et fugit amet reprehenderit iusto ut ratione, distinctio quia officiis quos quibusdam corrupti odit? Et nesciunt, assumenda aut repellat maiores ut exercitationem tempore ut aperiam facilis earum repellat ea. Perspiciatis et eum ut maxime, magnam saepe quae ea consequatur eos iure quae earum velit. Quaerat tempora dolorem sint unde aut quo sapiente aliquam sint, et itaque quibusdam error velit;\r\nRatione omnis sed quod iste laboriosam culpa similique unde voluptas alias dolores voluptas quaerat quae.'),
(36, '1993-01-24 17:32:57.340', 36, 'Vitae eaque repudiandae error tempore eligendi molestiae adipisci aperiam, officiis aperiam rerum iste nulla vel. Veniam adipisci explicabo ratione nihil error accusamus culpa aut, qui iure pariatur dolores quo omnis. Sunt consequatur laboriosam aperiam repudiandae omnis fuga architecto animi error repellendus nostrum architecto ut voluptas. Recusandae sed aperiam obcaecati rerum est nostrum facere illo sit quis aut rerum quis iste; in non error sit eos natus rerum amet voluptatem laboriosam eos unde nemo fugiat quod. Excepturi iste aut omnis maxime dicta et at facere necessitatibus ipsa possimus deserunt modi perspiciatis! Quae qui at ipsam unde porro perspiciatis unde vitae pariatur aut sequi et non unde. Soluta perspiciatis excepturi facilis quam explicabo soluta eaque doloremque impedit error ut nostrum natus suscipit? Dicta doloremque non ducimus delectus ab iste aperiam et dolor ab est ut minima voluptatum. Consequuntur ipsum consequuntur accusantium magnam fugit nobis repellendus rerum quo voluptatem et corrupti ipsum tempore? Natus quisquam eum voluptates doloremque similique saepe minus sed et fuga corporis sint omnis rerum;\r\nVoluptatem omnis sit, sint deserunt reiciendis sunt dolorem natus quos omnis sequi ipsa et est. Omnis tenetur odit labore doloremque aut ut, deleniti ut voluptas necessitatibus beatae doloremque porro pariatur. Error exercitationem, quod est error consequuntur placeat incidunt sit dolores sit culpa illo architecto tenetur! Sint tempora eligendi quia eum enim nostrum incidunt enim explicabo hic illum non consequatur obcaecati. Excepturi a omnis ut dolorum dicta repellendus ea sint quisquam quia neque necessitatibus eius ut. Doloremque placeat sed impedit ut aspernatur minus ducimus at ut ex porro non autem atque! Voluptatem beatae dicta sint at inventore enim veniam sed officiis voluptatem magnam quia qui nemo. Consequatur tempore dolores praesentium voluptates perspiciatis nesciunt, incidunt et est voluptatibus non unde similique numquam; et rem corrupti omnis ipsam eaque fuga voluptatibus minima veniam doloribus et sit inventore nostrum;\r\nSequi officiis, corrupti omnis nostrum soluta aut adipisci voluptatem dolor iste expedita quia sapiente et. Aut rem, dignissimos voluptatem iste veritatis inventore magnam velit quod enim saepe qui tenetur aliquid.'),
(37, '1990-06-20 04:39:05.350', 31, 'Ea dolorum quis voluptatem sapiente magni nemo ab, amet quidem ut exercitationem eveniet cum veniam. Ut sed, tempora rerum repudiandae rerum doloribus in magni et cupiditate repudiandae dolor asperiores est. Doloribus quas alias error soluta non aut iste voluptatem nemo provident ratione atque eveniet ut? Veritatis nostrum voluptatem ullam unde odit et, ipsam id voluptatem quia numquam error ullam sed; sed esse alias sed quam error dignissimos commodi sint repellat corporis id laboriosam temporibus iusto. Facere mollitia consequatur unde aut amet et omnis, quis sit sed quia sunt esse iusto. Et sed ut eum ut error ratione, eius vel numquam a ea veniam dolores velit. Voluptatem ut fugit earum ut nesciunt libero aut quibusdam, non accusantium blanditiis ea cumque eum. Hic cum, necessitatibus corporis assumenda animi placeat deleniti hic non ut id et voluptatem sit! Odio sed dolor fugit obcaecati ad magnam enim ipsum quia incidunt atque aut dolore unde. Delectus mollitia omnis blanditiis quo perspiciatis animi et laudantium delectus natus nihil voluptatem quas placeat. Omnis et voluptas voluptate qui omnis quis consectetur cupiditate officia delectus perspiciatis dolorem impedit perferendis! Ea voluptatem consectetur consequuntur commodi tempore a repellat ea eaque iure, vitae nostrum sed voluptas. Corrupti dolore et magnam sint et non tenetur sed delectus aliquid sint quia aut dolores. Perspiciatis ut, dicta nulla voluptatem officia qui dolore aut est rerum accusantium repudiandae dignissimos excepturi? Doloremque esse maiores vel qui impedit, ex possimus sit tempora ut dolorem unde iusto cum. Nemo nihil repellendus ut nisi id, libero aut distinctio eaque error ab sed vel dolor; laborum perspiciatis unde quaerat consequatur iste sed adipisci qui atque maxime quia fugit neque nobis. Sit et, accusamus sit ex unde sapiente porro voluptas nihil voluptatem omnis voluptatem omnis quas. Nobis quia eos qui ullam et amet ea labore doloremque et repellat aut voluptatem rerum!'),
(38, '1989-01-17 22:15:44.370', 10, 'Animi similique sit voluptas eos excepturi quibusdam doloribus eligendi quia, in illum numquam sit eum; architecto est perspiciatis quia repellat illum vitae aliquid molestiae cum modi vero commodi voluptatem nostrum. Distinctio ipsa a esse temporibus velit temporibus rerum animi quas sed ex ut amet sit. Vitae natus quos non recusandae quisquam quia sequi dolore, et omnis sint aliquid et in. Illo aut obcaecati quis assumenda voluptatum blanditiis modi laborum facilis cumque ab qui consectetur distinctio! Pariatur illum fugiat est debitis laborum laudantium dolorum eos numquam harum sed repellat qui est. Natus eligendi nulla, ut vero et odit sequi sed aliquam consectetur neque eos placeat minima. Omnis sunt consequatur magnam, ratione soluta quisquam facere repellendus alias ipsam temporibus sed illo fuga. Sit eius ut sit, dolore expedita hic incidunt error eum sequi blanditiis doloremque soluta unde! Delectus molestias incidunt eligendi et dicta aut ab, dignissimos iure esse qui quis est sed. Dolor enim assumenda ut eius cum voluptatem, quis expedita obcaecati exercitationem modi recusandae atque vero. Ratione dolorem consectetur magnam beatae aut et a sit voluptas voluptatem maiores sit vitae corporis. Et ratione aliquam sit vel aut sit est distinctio cupiditate commodi amet enim tempore aliquid! Ut voluptatibus non exercitationem laudantium perspiciatis, ab qui adipisci ut omnis voluptatem est aut natus;\r\nHic corrupti, sed non dolores vitae quae sed exercitationem sint eum cumque veniam optio voluptatem. Sit aut et, soluta quo perspiciatis eos iste veniam et possimus distinctio perspiciatis deleniti ex. Aut est quisquam sint, laboriosam voluptas commodi itaque distinctio eius maxime est omnis earum sed. Error quo nihil, in ea voluptate sunt eum provident veniam mollitia deleniti qui repellendus unde? Officiis numquam, non qui laudantium modi sapiente voluptatem quis rerum fuga unde quibusdam corrupti sunt; et cumque illo recusandae aut dolor debitis veritatis perspiciatis ipsum ut harum consequuntur suscipit voluptates. Voluptatem fugiat deserunt sed perspiciatis a exercitationem vel omnis ut cupiditate voluptatem in dolor voluptatem! Eum eius excepturi quae omnis, at ut dignissimos reprehenderit ipsam nostrum ut sed provident ut. Natus voluptates error architecto error iste exercitationem obcaecati saepe deleniti est natus ea mollitia quasi. Sapiente neque sed id corporis ut repellat nostrum voluptas assumenda ea sunt est suscipit ducimus. Necessitatibus molestiae voluptatem consequuntur rerum numquam quia qui sit dolorem eos error et voluptatem autem. Ut porro ut molestias quia aut ut ipsa deserunt quibusdam ut qui adipisci et voluptas? Consequuntur debitis eaque nesciunt est, tenetur architecto quasi qui unde doloremque porro mollitia commodi porro. Magni ut nulla autem reprehenderit nulla voluptas beatae saepe culpa qui odit voluptatem aut ipsum! Numquam vel id consectetur quae rerum dolor, aliquid quam et voluptatum dolore fuga non aspernatur. Nobis quia velit architecto natus voluptatem voluptatum quae et sed id voluptatem ipsum ducimus aliquam. Eligendi aspernatur sed aut enim delectus est corporis aut fugiat et iste dolores sit voluptatem. Voluptas velit inventore voluptatem qui veritatis consequuntur temporibus mollitia dicta hic exercitationem aliquam eaque cumque. Ex in aut aliquid ut et quam perspiciatis est odit blanditiis id error sequi architecto.'),
(39, NULL, 2, NULL),
(40, '2006-02-26 20:20:17.240', 43, 'Quidem sed non reiciendis dolorem natus nihil alias perferendis laboriosam est sequi natus consequatur et; saepe id et qui suscipit sit sequi dolorum illo expedita, corrupti velit alias consequatur quia. Error ut hic quos atque ut optio odio et, veritatis ut reprehenderit perspiciatis inventore et. Iste at alias est cum aspernatur perferendis voluptatem voluptas quasi perspiciatis laborum officia assumenda nesciunt. Qui natus deleniti id qui error sequi ut possimus officia vel aut maxime non fuga; laudantium minus obcaecati quidem, magnam ullam quia dolorum ipsum sed sint illum enim id deserunt. Temporibus fugiat vitae officia sunt impedit tempore minus accusamus quos praesentium quas provident quo et; quia doloribus recusandae perspiciatis sed unde rerum, voluptatem facere natus ipsa iste qui fuga voluptatem;\r\nExercitationem aspernatur quibusdam, nulla sed enim eum consectetur ut iusto deleniti magni asperiores non alias; quia adipisci et qui et quisquam id quaerat voluptate et distinctio consequatur aut dicta quod. Sed est voluptates veritatis error tenetur corporis ipsum, temporibus omnis et maiores error voluptatibus temporibus. Voluptatem aut voluptas sed quia quaerat ut necessitatibus iste accusantium quis sed sit voluptas at. Maxime vero voluptatem esse ullam consequuntur neque natus soluta necessitatibus neque id voluptatibus beatae illum. Sunt ex quibusdam veniam cupiditate ipsa incidunt enim amet qui sed illo facere possimus et! Aut dolor ad eos labore voluptas totam eveniet vitae aut distinctio modi qui omnis necessitatibus; unde velit optio ut enim ut unde qui iste error pariatur odio atque eos incidunt. Reprehenderit incidunt natus consequuntur enim consequuntur quis quia ut enim est quos ex fugiat voluptatum. Culpa aut aperiam, neque temporibus labore dolorum perspiciatis sed perspiciatis quia nesciunt et harum doloremque. Sint ratione aspernatur quos voluptatem quis sed obcaecati aliquid molestiae qui est cum explicabo odit; sed eum et dolores unde cumque nobis fuga in eius dolor sit soluta odio obcaecati. Qui consequatur, est provident et ut nam et sed doloribus est sit nisi numquam labore. Vel fuga magnam exercitationem ipsam, sit ut voluptatum fugiat inventore ut rerum voluptatem reprehenderit inventore? Sapiente quis non et, omnis enim voluptatem laboriosam voluptatem molestiae sit tempore laborum quia voluptatem. Atque ea ut natus esse eligendi voluptatem velit placeat ut officiis laboriosam doloremque ut mollitia!'),
(41, '1971-11-01 03:31:13.080', 48, 'Quia rem quis debitis blanditiis enim perferendis enim consequatur beatae omnis beatae odio omnis qui. Quaerat natus ab hic, incidunt eaque iusto accusantium ut laboriosam nisi sed corporis voluptatem tempora? Inventore magnam non qui quis sapiente quasi laborum fugiat aliquam tempora sint ut fuga exercitationem! Aut omnis aut unde quod et voluptatum quibusdam placeat ipsum dolor laborum ut ipsa dolore? Possimus sed ratione vitae ut consectetur labore laudantium alias facere aliquam aut voluptatem impedit cumque. Reprehenderit magni, pariatur hic culpa minima id illo totam excepturi error nemo reprehenderit consequatur architecto. Earum omnis dolores qui autem vitae quo, ab inventore accusamus quibusdam suscipit ipsum velit sunt. Sunt nisi quam aliquam sunt in dolorem non quis ut omnis voluptatibus vel omnis dolor. Non in ut suscipit magnam dolores nihil sint mollitia sint dignissimos explicabo quia rerum et? Qui nesciunt velit iste vitae ea dolorem rem officia fugiat enim commodi cumque facilis nihil; deserunt quis sint, nobis alias quisquam tempore ratione error deserunt temporibus aut est et distinctio. Quasi nobis consequuntur sint qui nihil quis error et vitae ad unde eum molestiae voluptatem. Natus praesentium molestiae similique rerum earum reprehenderit vero molestias eius quidem eos aut pariatur in. Et perferendis nemo error repudiandae ut aut sed iste reiciendis illo vel eum nihil qui! Magnam iusto tenetur ut saepe quis consequuntur voluptatem in reiciendis alias omnis itaque eveniet corrupti.'),
(42, '2008-09-20 13:32:15.960', 20, 'Unde in iste ut natus consequatur veniam vitae sapiente et dolore et beatae laborum omnis; odit minima harum voluptatem sit earum et voluptatem ratione est itaque reprehenderit ut pariatur nulla. Ipsa sed ut et sed architecto reiciendis fugiat voluptatibus, tempora veniam iste tenetur assumenda aut? Provident doloribus perspiciatis molestiae et sed tempora non blanditiis sed similique quia ab minus ex. Enim facilis nihil voluptatem placeat aliquid officia dicta illum aliquam perspiciatis molestiae pariatur et quaerat. Ratione amet consequatur perspiciatis labore placeat vel sequi laboriosam amet explicabo quis sit corrupti ducimus? Numquam natus facere dignissimos qui dolore sit maxime aliquid quo voluptatem et sit rerum eum; rerum eaque amet praesentium, ducimus et facilis et similique explicabo quia et distinctio similique sed; ducimus aspernatur adipisci voluptates officiis doloremque quasi id accusantium voluptatem quis est eligendi et aliquid. Perspiciatis voluptatum perspiciatis similique aut tempora enim sed temporibus corrupti aperiam sit unde voluptates at. Quo ea omnis cumque aut voluptatibus porro cupiditate voluptates earum quaerat qui dolorem nisi possimus! Omnis error est quis veritatis recusandae, aliquid inventore ipsum id commodi vel est amet est. Earum fugit sit qui consectetur eveniet, cumque repellat aut in unde dolorem molestiae velit tempora! Et minima velit doloremque iusto repudiandae modi error sit illo ex laboriosam in voluptatem deleniti. Suscipit deleniti quidem modi qui aut provident laudantium sint quo corporis laborum accusamus ipsam qui. Vero blanditiis delectus quaerat qui excepturi suscipit qui omnis aut deserunt aut vitae sit dolore. Quas sunt, soluta atque molestiae sed perspiciatis eum magni necessitatibus maxime neque vitae aspernatur esse. Aperiam ipsum amet veniam vel quia voluptatum asperiores aut sed ab necessitatibus enim consectetur iste.'),
(43, '2020-02-24 16:41:53.900', 39, 'Aspernatur incidunt beatae laudantium in qui vitae vel unde, obcaecati rem autem vel numquam est;\r\nNumquam et officiis illo corporis ut fugiat libero dolorem voluptates, voluptatem atque aut accusantium molestias. Reprehenderit debitis magnam sunt nulla unde cupiditate qui sit ipsum voluptatem autem natus beatae dicta. Quo dolores, rem dignissimos consequatur id eaque corrupti id repellendus qui assumenda voluptatem maiores ipsam. Exercitationem qui non repellendus quas soluta qui molestiae perspiciatis nobis quia dicta perferendis sed eum; sit deserunt deleniti sunt, molestiae unde tenetur ut provident obcaecati molestiae natus tenetur pariatur et. Libero perspiciatis accusantium ea quia illo quae recusandae qui quam qui possimus vel tempora eaque. Aut ea, consequatur eos iste consequatur voluptas non necessitatibus delectus et ea consequatur ut magnam! Beatae dolorem fugit id soluta sed iste unde neque vitae illo rem, consequatur omnis laborum; officia natus molestiae magnam sint dignissimos est non aut cupiditate dolores iste dolor repellendus consequatur. Blanditiis perspiciatis aut minus saepe nisi eveniet eius ut suscipit ex eos autem nulla placeat! Ipsum omnis laborum fugit laudantium perspiciatis, et in fuga adipisci officia ratione accusamus vel architecto. Illo omnis distinctio quia animi velit repellendus enim sed voluptatum iste suscipit sit aperiam velit? Minus sed corporis natus nesciunt reiciendis et eum omnis sit ipsam et nisi omnis est. Veniam laboriosam aliquam voluptatem qui non totam aut inventore cumque nisi cumque, et molestiae illum! Optio quia et illo sit, explicabo eos alias sed ut voluptatibus facere error eos sed. Soluta accusamus rerum laborum veritatis voluptate deserunt autem enim accusamus voluptas aliquid sed ad consequatur. Porro veritatis quae et dolor et ipsa beatae quidem ut quia voluptates error iste neque;\r\nRepudiandae iusto et maiores adipisci dolorum ut aut quasi quos magni aspernatur aliquid nihil in. Ad eos voluptatum rem ratione autem et iste consequuntur iste earum qui eaque fugit iste! Omnis ipsam quidem facilis rerum ut neque sint est aut non officia a atque sit. Minus dolorem harum sapiente explicabo ratione placeat sunt qui omnis voluptatibus, ut ipsam aspernatur voluptas. Dolor quaerat sint vel sit dignissimos laudantium velit qui sed earum eum ut iusto aliquam. Minus pariatur et rerum eaque odit ea ad non sed quidem mollitia quasi deserunt ut? Perspiciatis tempore aliquid, dolores aliquam vel suscipit architecto voluptatem iste voluptas fugiat at maxime numquam. Atque sed quo quos doloribus, quia dignissimos temporibus repellat et hic neque temporibus quos est. Et sunt porro, impedit nostrum molestiae animi voluptatem autem quod enim vitae dignissimos quibusdam reiciendis. Asperiores ut quam, corporis autem architecto nostrum est cumque quia dolor sit distinctio optio enim. Ea dolorum totam alias quis natus, quia totam aut voluptatem ipsam unde expedita voluptatem itaque! Et ut quos mollitia officia et suscipit dolore asperiores cum quod praesentium possimus harum modi. Odit et ut perspiciatis omnis quia, aperiam est libero labore perspiciatis sint sunt omnis minus! Nostrum natus omnis aliquid aperiam aut repellat, ab adipisci eligendi odit sed natus distinctio eos? Fugit ipsum molestias, dicta qui est perspiciatis et sit nisi tempore sit et dicta veniam.'),
(44, '1998-04-29 12:31:00.170', 10, 'Saepe non architecto et voluptates nihil quia qui repudiandae eos nemo quisquam fugit pariatur aut. Quia quisquam est dignissimos ullam qui libero quisquam, commodi veniam quia ut consequuntur facilis cumque. Omnis consequuntur natus vero officia delectus voluptatem voluptas dicta et mollitia adipisci quia natus excepturi.'),
(45, '2020-07-12 14:37:08.250', 1, 'Iure amet soluta laborum corrupti molestias fugit modi consequatur mollitia optio magnam assumenda natus in. Aut deserunt nemo maxime molestiae enim et mollitia nulla et corporis culpa aut non voluptas. Amet cupiditate odio id facere voluptatem hic facere distinctio natus sunt iste cum consequatur repellendus. Quod corrupti, reiciendis ut molestiae ipsa iste facere aut earum exercitationem est id quasi consectetur; doloremque magni aut est et quibusdam sint natus nobis dolorem voluptatem quidem natus unde perspiciatis; ut ipsam consequatur aspernatur ut, eius laborum eveniet accusantium provident illum sit sequi possimus quo; incidunt voluptas error ut laudantium assumenda error enim iure quis incidunt ut asperiores adipisci magni; recusandae facilis unde enim consequuntur saepe nam dolore consequatur repellendus omnis magnam enim sequi accusamus? Cum reprehenderit molestias, esse aut expedita voluptas natus minus deleniti natus odit culpa commodi voluptatem. Possimus tempora distinctio veniam molestiae illum aspernatur facilis accusantium natus nobis consequatur sed provident ad. Aut aspernatur, eum ea optio reiciendis consequuntur porro eos et doloribus quia porro et similique? Omnis aperiam sunt nostrum adipisci commodi nam unde adipisci rerum consequuntur, sit atque sunt aliquid. Autem eveniet magni eos natus quos error perspiciatis sint nemo qui atque quo sed autem. Qui eaque explicabo ad, suscipit aspernatur distinctio voluptatem ut eum sit officiis voluptatem sunt tempora! Sit aliquid ab alias cum laborum voluptatum quasi quis dignissimos est expedita quibusdam aliquam vel;\r\nQui in voluptatem est, et sit error vitae veritatis rerum inventore voluptas quia omnis totam. Odio sunt et quis quam voluptates fuga nemo perspiciatis consectetur necessitatibus omnis autem aut dolor.'),
(46, '2000-10-17 19:59:58.690', 20, 'Vitae similique ut fuga consequatur modi reprehenderit id porro nemo suscipit non, delectus optio doloribus. Expedita omnis ipsum quis neque quasi totam natus laudantium aut molestias atque repellat rerum assumenda. Voluptatem repellat rerum enim architecto beatae culpa et id iste perferendis et nam molestiae obcaecati. Voluptatem inventore ipsum quisquam quia consequuntur numquam quaerat aut fugiat optio ratione voluptatum omnis laudantium. Molestiae sequi voluptatem optio iste, eos eum reiciendis nostrum quo obcaecati eaque ratione ut sed; doloribus ullam ex iusto rerum vero sint tempora recusandae eos ut quia quae mollitia eaque; voluptates modi laboriosam sit saepe iste natus, et at accusamus officiis accusamus ratione aut at;\r\nLabore saepe omnis recusandae natus, consectetur perspiciatis voluptas voluptatum debitis voluptas corporis earum repellendus et. Nisi iure excepturi, quae sapiente placeat et quisquam voluptatibus ab sunt et distinctio quis iste; alias et accusamus dicta eveniet nihil voluptas iusto dolore nam sit impedit dolorem est sapiente.');
INSERT INTO `history_orders` (`id`, `date_create`, `order_id`, `description`) VALUES
(47, '1992-11-16 06:45:15.660', 6, 'Voluptas illo nulla consequatur sint non est dolorem nihil voluptate et ut molestiae sunt minus; qui perspiciatis nihil dolor repellat quibusdam, nesciunt ipsa harum omnis dicta nisi asperiores rerum aut. Iste eius ipsum dolore sunt quis ea perspiciatis pariatur alias fugiat ipsam voluptatem quia ex! Aut eaque consequatur eaque suscipit porro, voluptatem pariatur voluptatem corrupti quia nemo eum officia obcaecati; consequuntur non ex officia, dolorem maxime nemo magnam voluptatem perspiciatis illo rerum debitis dolorem id. Aut eveniet molestiae est et, quod corporis natus quo quos nostrum ea rerum adipisci sequi! Quis magnam eveniet cumque temporibus consequatur aut itaque labore sed perferendis voluptates atque et iusto. Aliquid unde tempore et repudiandae quod odit eligendi minima qui ut ea ut consequatur maiores! Cum dolores molestias unde dolor corporis nostrum consequatur, dolorem consequuntur sunt necessitatibus sed molestiae placeat? Totam itaque, atque rerum quidem ratione ut deserunt nobis atque incidunt aut unde quod non. Sit unde odit quod corrupti totam ex iusto quia iste architecto voluptas commodi qui cupiditate. Necessitatibus error ab debitis voluptatem unde minima voluptatem doloremque nesciunt cum quas est dicta qui.'),
(48, '2010-04-16 13:45:44.090', 30, 'Omnis fuga, expedita commodi modi dignissimos necessitatibus et minima saepe deleniti obcaecati et fugit rem. Itaque quod minima pariatur eligendi ab nobis excepturi aut perferendis aut provident et exercitationem accusantium. Sit est dicta minima dolorem, qui nihil recusandae veniam delectus iusto optio inventore omnis quia! Repellendus nobis fuga consequuntur velit et maxime iusto ducimus eaque cumque enim quia non porro. Voluptatem velit consequatur esse tempore voluptatem quia, porro dolorem facilis eligendi quaerat sed asperiores sed! Consequatur et qui quia et non dolorum explicabo sequi debitis dolores dicta saepe adipisci et? Aspernatur numquam animi minus et eligendi nihil perspiciatis ipsam autem temporibus explicabo sed accusantium et. Excepturi sapiente officia ullam perspiciatis quo labore nihil eos quos aliquid provident omnis ut sapiente. Consequatur sed qui est in aut dolor unde voluptatum aliquid deserunt laboriosam iure sequi omnis..;\r\nVelit et ut quasi error numquam error sed sequi qui aut molestias provident et qui. Tempore assumenda eius qui dignissimos similique nesciunt iste praesentium laboriosam est fugiat consectetur accusantium consequuntur. Tempora eum harum est architecto iste sed porro voluptatem unde assumenda architecto labore ut voluptas? Nisi dicta, doloremque fugit et recusandae est iste laborum eaque perspiciatis voluptatem suscipit quidem sed; et autem qui error doloremque officiis consectetur reiciendis qui enim voluptates earum rerum ex enim. Consequatur itaque exercitationem perspiciatis enim molestiae aspernatur magnam quisquam ut nisi earum voluptates magnam quia. Debitis natus architecto et, deleniti ullam adipisci earum dolorem qui consequatur cumque velit in veniam? Possimus molestias, laboriosam beatae fugit soluta aut qui minus ratione nobis esse voluptatem aut dolore. Dolores perspiciatis eveniet et voluptatem sit dolore, error optio neque aut ab qui perferendis voluptatem! Consequatur autem ut pariatur velit nesciunt maiores optio dolor repellendus obcaecati perferendis quia repellat aut. Ad dolorem, quidem et quod error quidem molestiae repellendus perspiciatis non voluptatem error sint iure? Quam rem quae non est neque omnis consequatur doloremque ad cum voluptatem natus atque ut. Sed ea officiis saepe, eos dolorum vero sed totam sit vero magnam vero ut consequatur. Aut mollitia ut velit corporis iste cum ut laborum pariatur necessitatibus perspiciatis unde facere vero? Voluptatem error et placeat, voluptatibus officia commodi sint nam exercitationem molestiae laudantium dolorum beatae consectetur! Cumque et dolores et porro placeat quia sed sit omnis pariatur adipisci fugit excepturi sed? Unde ut quo consequuntur molestiae quia autem enim labore tempora ab eos officiis voluptates ab. Non excepturi, optio atque minus dignissimos ea consectetur autem officia consequuntur mollitia et sunt aut. Ut iure, amet beatae sed quia necessitatibus perferendis omnis est dignissimos delectus aut quia sed. Sequi unde, minima corporis voluptatum quas cumque itaque qui sed error aut quos ea voluptas.'),
(49, '2010-10-07 14:39:05.240', 12, 'Nam qui dolorem temporibus, ab tempora totam fugiat quod est consectetur inventore illo repellendus ipsam. Aliquam rem nulla ipsam dicta debitis sint dolor aut est ipsa impedit dolorem rerum itaque. Omnis et, quibusdam nihil minima alias exercitationem deleniti voluptatibus eos animi veniam non vel a! Atque corporis libero ut fugit et alias voluptas nesciunt quaerat eligendi aspernatur totam omnis sed. Repudiandae qui aperiam quo cumque sed dolores eligendi repellendus qui dolore dicta qui eius beatae. Et velit minima unde sed odit ducimus doloremque quod obcaecati architecto esse qui quo labore. Facere nulla ducimus aliquid excepturi voluptatibus veritatis perspiciatis exercitationem provident illo iure nostrum et explicabo. Consequuntur sunt vero animi ducimus in, nihil consectetur voluptatem modi sed aliquam ipsum aliquid iure. Sit eos nesciunt iste unde eum itaque ut totam assumenda non deleniti molestiae eligendi impedit? Quidem dolorem omnis quibusdam vitae dolores perspiciatis sed et sit et aperiam nulla consequatur aperiam. Ducimus fugiat, numquam minus doloremque totam distinctio cum perspiciatis rerum qui non ut doloribus consequatur. Iste dolores praesentium eum error omnis voluptatem architecto ad aut omnis ut deleniti excepturi sit.'),
(50, '1986-08-26 08:41:04.290', 2, 'Natus ipsam quo dolorem tempore et non in iste ab enim et consequuntur natus et. Fuga consequuntur, hic aspernatur voluptatem laboriosam molestiae voluptatem voluptatum reiciendis nisi saepe doloribus magnam ut! Sit et quaerat ut consequatur corrupti laudantium labore architecto laboriosam nesciunt aut labore eum quasi. Blanditiis laboriosam aspernatur ut accusantium dolorem doloremque animi exercitationem laborum beatae natus suscipit dolores ullam. In placeat error totam est harum soluta a, exercitationem doloremque libero suscipit porro qui natus! Exercitationem velit aut libero voluptate exercitationem doloribus beatae ut et dignissimos maiores aut qui et? Labore ut cumque provident molestias ullam unde culpa qui et vero sunt quo debitis rerum! Ab quaerat laboriosam sint dolorum odit non, veniam numquam unde obcaecati id laboriosam sit sed? Sed quis nam consequuntur distinctio omnis sed dolor nobis ab ut at ut odit fugit. Excepturi quia et aspernatur doloribus distinctio sequi numquam voluptatem delectus error suscipit dicta ab natus. Unde voluptatem, perspiciatis numquam sunt deserunt enim fugiat explicabo iste cum consequatur laboriosam dolorum molestias; et sed esse omnis corrupti, ea dolorem voluptate eveniet dolores tempora explicabo placeat illo sit? Natus eum, ad omnis sit ut delectus ut voluptas ea rem iste ea ut sed. Velit voluptatem ut nemo tenetur soluta dolorem neque, qui illum ex et error optio excepturi; et maiores ut nostrum natus, qui veniam aperiam incidunt et quo sit eos et minus. Quia sit molestiae quaerat itaque debitis ab enim nemo hic ut delectus ut quae non. Ut voluptatem hic ipsum eum ut sed ut ratione voluptate tempora harum enim ut adipisci;\r\nAutem repellendus corrupti quis blanditiis deleniti voluptatem aut voluptas, dolor error doloribus et dolores nihil. Ipsum facilis quibusdam a exercitationem sint eius quasi cumque voluptates sit voluptatem sunt praesentium quasi. Quia voluptatibus enim odio aut quia illum blanditiis nihil error molestias consequatur fugit facere numquam. Odio dolores illum itaque quos, nam eos sapiente earum eveniet iusto commodi qui eum voluptas! Ut nihil aspernatur temporibus eos, et dignissimos quae porro dolorem eos autem aut culpa optio. A veniam, commodi quas optio quas aut eligendi quo et omnis quam et possimus sit...');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `address` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `address_detail` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `time_create` datetime(3) DEFAULT NULL,
  `staff_id` int(11) DEFAULT NULL,
  `delivery_cost` decimal(15,4) DEFAULT NULL,
  `return_order` tinyint(4) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `id_acount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `address`, `address_detail`, `time_create`, `staff_id`, `delivery_cost`, `return_order`, `status`, `id_acount`) VALUES
(1, '3739 NW Ashwood Street, Nipper Building, Salem, Oregon, 81370', '1645 West Beachwood Blvd, 2nd Floor, Boston, MA, 40710', '1975-11-01 06:26:21.040', 1, '1437.9106', 0, -880027700, 12),
(2, '2230 Edgewood Rd, APT 88, Madison, Wisconsin, 66727', '493 Red Hunting Hill Blvd, 2nd Floor, Boise, Idaho, 90254', '1989-08-23 23:04:34.850', 2, '477.6338', 0, -1237494025, 34),
(3, '1658 South Rose Hill Dr, Boise, ID, 07346', '914 Hope Loop, Topeka, Kansas, 05736', '2000-02-20 06:59:20.560', 3, '1162.5252', 0, -1503667975, 19),
(4, '389 Fox Hill Ct, Judge Bldg, Phoenix, Arizona, 94585', '913 Ashwood Highway, Sacramento, California, 63601', '2020-06-14 00:21:57.260', 4, '1306.6767', 1, 708, 48),
(5, '28 Meadowview Ln, Superior Bldg, Augusta, ME, 03344', '21 Rose Hill Road, Nipper Bldg, Honolulu, Hawaii, 63616', '1979-04-25 18:12:14.950', 5, '1524.0847', 0, -1048650424, 16),
(6, '787 W Hunting Hill Court, Macy\'s Bldg, Springfield, Illinois, 73729', '1696 Hazelwood Ave, 1st Floor, Atlanta, Georgia, 47275', '2016-02-09 11:40:53.050', 6, '392.7972', 0, -1542031234, 30),
(7, '163 92th Circle, Judge Bldg, Salt Lake City, Utah, 76270', '425 SW Fox Hill Court, Columbia, SC, 53434', '2003-08-08 20:08:00.800', 7, '1002.3630', 1, -2041217293, 33),
(8, '607 Mountain Hwy, Albany, NY, 85340', '1825 West Prospect Hill Ln, Duke Energy Building, Montpelier, Vermont, 39256', '1988-12-10 06:58:55.790', 8, '1818.2660', 0, -1427532365, 45),
(9, '986 North Buttonwood Drive, STE 457, Topeka, Kansas, 07879', '2055 North Rock Hill Rd, Fisher Bldg, Honolulu, Hawaii, 42745', '1974-06-21 17:42:40.470', 9, '1634.5962', 0, -1566134516, 12),
(10, '2617 Rock Hill Highway, Olympia, Washington, 71117', '17 Hidden Ski Hill Ave, Jefferson City, Missouri, 99739', '2011-11-29 13:26:18.020', 10, '733.8945', 0, -8788, 47),
(11, '655 Church Lane, Albany, NY, 91725', '217 Church Blvd, 2nd FL, Bismarck, North Dakota, 94269', '1999-11-01 18:53:56.680', 11, '1643.6218', 1, -57131972, 12),
(12, '3606 North Sharp Hill Ct, Cheyenne, Wyoming, 40194', '462 Hidden Brentwood Ct, Olympia, WA, 35364', '1996-02-27 21:13:33.010', 12, '288.3538', 1, -204892992, 6),
(13, '25 Town Street, APT 112, Annapolis, MD, 51281', '571 Flintwood Avenue, Macy\'s Building, Phoenix, AZ, 58044', '1971-04-27 03:19:38.440', 13, '866.1327', 1, -1768601707, 21),
(14, '1963 Riverside Hwy, Judge Building, Nashville, Tennessee, 19004', '113 W Rushwood Hwy, Columbia, SC, 62932', '1989-05-08 06:11:15.040', 14, '823.0794', 1, -2123380366, 19),
(15, '1846 Old Hunting Hill Cir, Jackson, MS, 64244', '73 Mountain Ave, Salt Lake City, Utah, 69823', '1999-11-23 11:23:43.530', 15, '1729.0378', 1, -1778631251, 37),
(16, '304 Riverside Drive, Olympia, WA, 71542', '272 Lake Loop, Juneau, AK, 99460', '1999-12-04 20:18:50.350', 16, '1272.7495', 1, -2034999787, 16),
(17, '69 Woodland Highway, Indianapolis, Indiana, 34174', '1289 Stonewood Street, Olympia, Washington, 36241', '2015-07-28 02:04:20.940', 17, '156.7660', 0, -1903809897, 20),
(18, '89 Rushwood Parkway, 3rd Floor, Austin, Texas, 44541', '264 Rose Hill Hwy, Hartford, Connecticut, 14356', '2013-03-08 23:40:29.720', 18, '1683.9583', 1, -1062171654, 24),
(19, '2748 Red Social Highway, Pierre, SD, 09274', '2318 2nd Lane, Jackson, Mississippi, 66381', '1984-03-27 15:16:08.890', 19, '1948.9311', 1, 16, 4),
(20, '106 E Pine Tree Street, Suite 6211, Lincoln, Nebraska, 46901', '93 West Deepwood Parkway, Victor Executive Building, Phoenix, Arizona, 10807', '2021-04-03 17:51:23.760', 20, '240.0804', 1, -87, 42),
(21, '816 S Town Way, Plaza Bldg, Austin, Texas, 50215', '68 North Rose Hill Parkway, Juneau, Alaska, 60751', '1980-06-30 00:46:43.010', 21, '1882.6263', 0, 1240, 4),
(22, '442 Red Rose Hill Road, 72th FL, Cheyenne, Wyoming, 63137', '2770 New Chapel Hill Court, Montgomery, Alabama, 64732', '1970-09-20 09:10:15.420', 22, '270.0905', 1, -940273079, 13),
(23, '852 Quailwood Highway, Trenton, New Jersey, 06330', '1027 Pine Tree Hwy, Dover, DE, 63089', '1978-10-07 22:23:20.770', 23, '1336.0586', 0, -1468739851, 6),
(24, '2410 South Woodhurst Avenue, Guardian Bldg, Raleigh, North Carolina, 47426', '2886 Old Rockwood Ct, Richmond, Virginia, 17829', '1970-01-17 07:59:21.440', 24, '1420.1333', 1, -14, 46),
(25, '3337 Glenwood Blvd, First Security Bldg, Lincoln, Nebraska, 80324', '1023 Pine Tree Way, Denver, CO, 43405', '2005-10-05 16:28:53.270', 25, '1192.8769', 0, 175, 34),
(26, '3261 S Bayview Highway, Columbia, South Carolina, 04319', '2587 S Sharp Hill Road, Macy\'s Bldg, Indianapolis, Indiana, 93770', '1977-02-01 01:47:27.560', 26, '1824.3336', 1, -529381214, 32),
(27, '1867 New Glenwood Ct, Dover, Delaware, 56441', '88 Farmview Rd, Plaza Bldg, Little Rock, Arkansas, 76236', '1987-11-05 15:19:15.330', 27, '567.0700', 0, -444, 1),
(28, '717 Fox Hill Parkway, Nipper Building, Columbia, South Carolina, 09692', '1529 Monument Ct, Sacramento, California, 72657', '2003-08-13 05:40:22.080', 28, '314.2191', 0, -1803288673, 49),
(29, '44 Red Meadowview Ct, Suite 70, Charleston, West Virginia, 26777', '2067 South Lake Parkway, Tallahassee, FL, 93974', '2010-04-26 11:58:33.070', 29, '1262.7235', 0, -752136693, 9),
(30, '460 Meadowview Pkwy, Frankfort, KY, 49040', '1252 Fox Hill Hwy, Denver, CO, 95261', '1994-03-23 05:47:07.670', 30, '501.5552', 0, -1078400957, 40),
(31, '1991 Chapel Hill Hwy, Bartlett Building, Pierre, SD, 11821', '480 Deepwood Parkway, Kearns Building, Baton Rouge, LA, 93397', '2000-10-28 06:12:01.230', 31, '1037.2242', 0, -581, 42),
(32, '1211 Old Brentwood Road, Helena, Montana, 87585', '711 Ski Hill Road, Appartment 34, Pierre, SD, 20327', '1976-06-07 09:57:34.280', 32, '435.9463', 0, -962, 7),
(33, '917 New Town Parkway, Denver, CO, 95160', '62 East Waterview Ave, Annapolis, Maryland, 38827', '1979-04-02 01:38:59.540', 33, '408.2967', 0, -129917365, 1),
(34, '2595 Chapel Hill Cir, Austin, TX, 30332', '2708 SW Glenwood Ave, Honolulu, HI, 13434', '1989-03-30 18:02:25.270', 34, '1865.4865', 0, -1920931898, 11),
(35, '58 55th Ct, Boise, ID, 34642', '3077 E Oak Lane, Harrisburg, Pennsylvania, 62123', '1997-06-03 06:03:44.000', 35, '1820.3878', 0, -4573, 13),
(36, '1243 NW Oak Ln, Juneau, AK, 50383', '878 Edgewood Highway, Equitable Bldg, Harrisburg, PA, 73457', '1973-09-26 05:02:58.720', 36, '1513.4163', 0, -1238628709, 41),
(37, '1183 Highland Court, Tallahassee, FL, 33180', '3214 Meadowview Rd, Des Moines, Iowa, 97724', '1985-12-19 09:15:13.630', 37, '1220.9402', 1, -178289369, 33),
(38, '812 Rushwood Pkwy, Columbia, SC, 68105', '799 Fox Hill Parkway, Montgomery, Alabama, 25900', '1985-12-24 21:29:24.280', 38, '1645.3566', 1, -1351721406, 41),
(39, NULL, '2669 Front Highway, Raleigh, North Carolina, 39519', NULL, 39, NULL, NULL, NULL, 20),
(40, '631 Brentwood Drive, Calyon Building, Boise, Idaho, 46219', '1905 Fox Hill Ct, Enquirer Building, Little Rock, AR, 18777', '1988-11-05 12:08:43.550', 40, '1291.9606', 1, -689378148, 27),
(41, '81 Social Loop, Appartment 11, Harrisburg, Pennsylvania, 93999', '1615 Rockwood Ave, Cheyenne, Wyoming, 34388', '1977-09-20 17:04:04.650', 41, '1307.6359', 1, -330340475, 40),
(42, '2114 Riverside Rd, Equitable Bldg, Salem, Oregon, 88844', '458 W Cedar Tree Highway, Nipper Building, Indianapolis, Indiana, 35829', '2011-03-21 22:11:56.600', 42, '1026.3804', 1, -346488775, 6),
(43, '2555 Hope Blvd, Fisher Bldg, Columbia, SC, 66634', '3193 Rushwood Highway, Raleigh, North Carolina, 74843', '2004-03-13 10:57:03.060', 43, '338.0395', 1, -538897206, 23),
(44, '540 Hope Loop, 2nd Floor, Columbus, OH, 69791', '12 Old Chapel Hill Lane, Olympia, Washington, 33765', '2014-03-13 11:12:58.180', 44, '1197.3212', 1, -792563703, 5),
(45, '2043 NW Lake Avenue, 1st Floor, Frankfort, KY, 51309', '143 Hidden Burwood St, Concord, New Hampshire, 26487', '2015-05-13 01:59:58.880', 45, '1473.3239', 0, -510, 37),
(46, '275 Social Loop, 1st FL, Topeka, Kansas, 51186', '926 Riverview Avenue, Frankfort, Kentucky, 92170', '1981-09-09 18:03:33.820', 46, '1763.7372', 1, -1995432542, 22),
(47, '545 West Rock Hill Loop, Honolulu, HI, 58078', '89 NW Glenwood St, Victor Executive Building, Trenton, New Jersey, 06107', '1999-12-10 13:08:47.250', 47, '1645.0420', 1, -1005232632, 37),
(48, '3601 Fox Hill Hwy, Cheyenne, Wyoming, 89749', '3273 Riddle Hill Ct, Raleigh, North Carolina, 33685', '2021-04-13 06:13:55.430', 48, '325.6882', 1, -150480943, 16),
(49, '569 Rock Hill Ln, Bartlett Bldg, Frankfort, KY, 21025', '413 Red Stonewood Loop, Lansing, Michigan, 17921', '1971-06-25 04:41:02.800', 49, '1553.1740', 0, 24, 35),
(50, '363 West Riverview St, Concord, NH, 96070', '1486 East Sharp Hill Parkway, Little Rock, Arkansas, 47165', '1997-08-15 21:31:04.020', 50, '1045.0486', 1, -1156725519, 36);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `product_name` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `description` longtext DEFAULT NULL,
  `is_deleted` tinyint(4) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `product_name`, `description`, `is_deleted`, `category_id`) VALUES
(1, 'WDX85-5T911-FH7P3-O3056-EMQK7', 'Nemo aliquid ut natus hic est laboriosam veniam reprehenderit dolores sit voluptas neque dolorem quaerat. Facilis ipsum voluptatem hic est unde et quis, est deleniti perspiciatis aut placeat ut velit! Voluptatem quo harum aut eligendi omnis voluptatem ex ut aut ut sed dolores natus in. Dicta et, laboriosam quos consequatur illum vero aut maxime et aut sunt quae aut quisquam! Voluptas nobis, sit ut at laborum voluptatem fugiat vel animi ducimus porro voluptatem saepe quos. Delectus nihil voluptatum et qui perspiciatis asperiores odio sed dolore esse obcaecati ea est dolor. Perferendis aut vitae accusamus ipsum consequatur repudiandae vel aut nisi sed accusamus cumque similique et! Voluptas est dolorem aut blanditiis unde saepe nobis quas facilis natus non quo perspiciatis quia. Molestiae necessitatibus ullam atque architecto facere natus laboriosam eos inventore non sed architecto et eos. Nostrum eos cumque et sit quia ullam dolores voluptas impedit numquam pariatur placeat sed unde. Amet odit cum qui iste perspiciatis et tempore fuga omnis culpa qui quidem cupiditate et? Exercitationem molestias unde non nihil tenetur ea consequuntur nobis sit dolores ut necessitatibus in laboriosam; eos voluptatum inventore qui, omnis esse praesentium iste voluptas consequatur et nobis nihil magnam dignissimos; odio eum exercitationem necessitatibus, a eum rerum quis suscipit aspernatur error non neque ad omnis. A libero voluptatem sit nisi et beatae aut velit officia dolores voluptatem deleniti numquam recusandae; omnis assumenda non dolor magnam deleniti natus ducimus officia error ut laudantium consequatur nihil sed.', 1, 22),
(2, 'WDX85-5T911-FH7P3-O3056-EMQK7', 'Nemo aliquid ut natus hic est laboriosam veniam reprehenderit dolores sit voluptas neque dolorem quaerat. Facilis ipsum voluptatem hic est unde et quis, est deleniti perspiciatis aut placeat ut velit! Voluptatem quo harum aut eligendi omnis voluptatem ex ut aut ut sed dolores natus in. Dicta et, laboriosam quos consequatur illum vero aut maxime et aut sunt quae aut quisquam! Voluptas nobis, sit ut at laborum voluptatem fugiat vel animi ducimus porro voluptatem saepe quos. Delectus nihil voluptatum et qui perspiciatis asperiores odio sed dolore esse obcaecati ea est dolor. Perferendis aut vitae accusamus ipsum consequatur repudiandae vel aut nisi sed accusamus cumque similique et! Voluptas est dolorem aut blanditiis unde saepe nobis quas facilis natus non quo perspiciatis quia. Molestiae necessitatibus ullam atque architecto facere natus laboriosam eos inventore non sed architecto et eos. Nostrum eos cumque et sit quia ullam dolores voluptas impedit numquam pariatur placeat sed unde. Amet odit cum qui iste perspiciatis et tempore fuga omnis culpa qui quidem cupiditate et? Exercitationem molestias unde non nihil tenetur ea consequuntur nobis sit dolores ut necessitatibus in laboriosam; eos voluptatum inventore qui, omnis esse praesentium iste voluptas consequatur et nobis nihil magnam dignissimos; odio eum exercitationem necessitatibus, a eum rerum quis suscipit aspernatur error non neque ad omnis. A libero voluptatem sit nisi et beatae aut velit officia dolores voluptatem deleniti numquam recusandae; omnis assumenda non dolor magnam deleniti natus ducimus officia error ut laudantium consequatur nihil sed.', 1, 22),
(3, '1269H-16E29-8D9O3-N2A4P-825JW', 'Ut consequuntur voluptas et, quod ipsum expedita saepe eum dolorem dolore sunt nulla et error. Omnis quas numquam qui nisi qui suscipit et, sunt maiores voluptas sequi vitae aut molestias! Quis molestiae perferendis voluptatum error atque repudiandae consectetur dolores nobis et delectus omnis aut cumque. Aut ipsum quidem aspernatur sed voluptatem soluta optio voluptas non sapiente alias neque animi aliquam; unde animi velit possimus nesciunt eum architecto consequatur tempora ut iste quisquam eius saepe ullam? Facere sapiente quidem sit necessitatibus ipsa quo voluptatibus architecto voluptatem sint consequatur doloribus non accusamus. Harum enim, nihil repellendus molestiae qui reiciendis quia voluptate fugiat voluptatibus modi adipisci tempore iste. Sunt sint deserunt modi error sequi omnis sit quis vero eos debitis et iste ut! Officia labore cumque enim dolor omnis possimus magnam quia vero et earum dicta in nisi. Assumenda doloremque voluptas necessitatibus unde sit dignissimos dolor corrupti aliquid ullam quasi doloribus ut blanditiis. Sit fugit, ratione unde quae magnam nam voluptatem et unde autem cupiditate eum harum nulla. Et quidem velit voluptatem, earum non voluptate ut sunt sit perspiciatis et sit recusandae sunt; ex repellat omnis sit quibusdam dolores earum asperiores architecto quas consequatur obcaecati aut maxime beatae. Repellat id sed aut aspernatur praesentium accusamus nesciunt vel error ea autem rem ipsum adipisci. Sed nemo natus sed, quam est dolore hic facilis omnis vitae repudiandae consequuntur ad vero. Nisi sed eum adipisci omnis sunt placeat ex ut placeat fugit qui tempora iusto maiores;\r\nVeritatis iste eligendi unde quos quia animi maxime distinctio aperiam numquam minus sit minima aut. Ratione velit magnam molestiae reiciendis, et voluptatibus mollitia officiis accusantium sit facere dolores consequuntur quo. Eius molestiae, iste voluptas et qui numquam et error enim libero cum est distinctio dicta? Quae quia exercitationem dolorem perspiciatis quam, impedit iusto voluptatem omnis officiis quasi incidunt consequatur doloremque. Molestiae error asperiores nihil itaque fugit magni natus autem enim sit aut sed repudiandae et! Sed aut, sed rerum nesciunt sit repellendus saepe unde ut voluptatem velit id dolorem dolores. Et enim, quia minima doloribus omnis quia voluptates quibusdam est cumque dolor perspiciatis dolorem eum.', 0, 11),
(4, '79Y2R-8YXN6-A56J9-EBSDW-MS36Q', 'Atque recusandae voluptas ut, voluptatem eius error maiores minima vel ullam ratione libero voluptatem facere. Ad quos amet, aut consequatur et nobis eos labore at assumenda id sint nihil sit. Nisi sed ad aut sit fugit distinctio est perferendis ipsum ipsam earum tenetur illo odit. Tempore dolor consectetur ducimus dolores et qui ea consequuntur vel quis dignissimos autem ipsam non. Consequatur dolorum, provident omnis nisi nesciunt repellat molestiae doloribus natus velit inventore necessitatibus esse voluptatem. Omnis ad quis facere ab autem aut unde enim architecto eius omnis quis fugit fugiat. Ullam nulla delectus vel fugit voluptas non, placeat voluptatem voluptas est ipsa corporis rerum quasi. Doloremque quibusdam error adipisci nulla sit error rerum omnis in laboriosam vero ducimus error vero! Dignissimos iste eos sit eaque accusamus velit qui est voluptas enim reprehenderit nesciunt ut qui. At quis voluptatem tempora eum et perspiciatis recusandae, laudantium sed et dolor molestiae consectetur est; optio cum hic consequatur ad voluptatem consequatur est minima natus unde hic neque molestiae accusantium. Voluptatem natus qui quis optio repellat in ut reprehenderit voluptatem vel dolores deleniti ipsa dolores. Enim perferendis in nisi sequi, totam repellendus sunt ipsa cupiditate rerum illo error aut eaque! Voluptatem beatae quo quia, quis accusamus sed iure rerum culpa voluptatem veritatis nulla dolor reiciendis. Nemo dolorum consectetur sint amet dignissimos rem perspiciatis id dicta non consectetur iste ut veniam. Quae omnis et qui blanditiis est amet ab, at tempora porro ea accusantium ut quisquam. Qui non sed fuga voluptatibus et expedita quod amet rem consequatur libero et aut in. Unde quo eum enim in adipisci, repellendus est numquam possimus sit sunt alias laboriosam dolor. Illum omnis sapiente in recusandae doloribus et non fuga ut a temporibus debitis enim error...', 1, 12),
(5, 'XCPO1-ITV4C-L5U5Y-E9B84-U7C92', 'Deleniti enim qui iusto officiis porro ea labore quidem eum amet sit rem ut non. Odit eaque, et dolorem molestias repudiandae beatae sed quis magni voluptate voluptates minus earum animi. Dolor quam quisquam voluptatum et illo iure sint sunt quae eveniet accusantium sunt sint eum. Et exercitationem dolorem est laudantium cumque repellendus provident blanditiis explicabo incidunt sit sed nesciunt culpa. Enim minus quis sunt enim error ut quia quaerat eos eveniet unde accusantium eligendi illum? Labore aut unde consequatur odit doloremque soluta eligendi beatae et aut quos natus vitae totam! Aliquam eos quia sunt necessitatibus libero est voluptatum molestiae ut tempora nisi dolor ipsam sed...', 0, 25),
(6, 'SY0U3-L6F2D-924K2-CK7M9-1NPZB', 'Aliquid assumenda rerum ab quibusdam voluptatem sit vitae voluptate nisi quisquam aliquid quia labore est. Eligendi totam est earum tempore officia aut, delectus dolore omnis officiis non accusantium molestiae velit. Omnis veritatis veniam sed alias ut suscipit ullam iste mollitia eos necessitatibus numquam minus quia; aut perspiciatis eos enim nulla architecto doloribus doloremque debitis ad iste quam aut rerum ut;\r\nIste error magni beatae rerum iusto ipsa eos amet quia distinctio sunt dolor consequatur corporis. Ut sit, similique quasi odio labore deleniti illum dignissimos explicabo quia nam consequatur vero ipsam? Dignissimos magni error perspiciatis consequatur consequuntur et vitae libero nostrum eius cumque rerum consequatur eos! Ex dolores unde sit enim unde quod quibusdam aut qui consequatur officiis sed itaque in. Vero eos consequatur quo, eum itaque totam omnis sed natus excepturi est aliquid molestias sit. Tenetur perspiciatis qui quis voluptas sed quia laboriosam alias fuga qui vero incidunt doloremque sit? Voluptate sunt ut necessitatibus et labore at adipisci aut ipsum rem voluptatem non ipsam accusamus. Temporibus ut rerum a sequi qui voluptate voluptatem et quibusdam ad atque inventore neque quo. Sit tempore illum, enim et qui ut fugiat voluptatem omnis suscipit quia iure dolor eius! Odio laudantium rerum assumenda facilis quas assumenda eum quis et corporis in quam eum assumenda? Molestiae cupiditate veritatis eligendi et modi incidunt vel atque ex voluptatem est quaerat excepturi quia! Doloremque eligendi perspiciatis et rerum eligendi molestias explicabo aliquid ducimus itaque omnis temporibus inventore sed. Error magnam nostrum qui ex aut iusto est similique nam facilis omnis non quia omnis; qui consectetur necessitatibus qui dolores error sunt velit est qui necessitatibus numquam voluptas non aspernatur. Cumque dignissimos rerum ipsa voluptate ipsum ipsa, laboriosam dolore error quibusdam dignissimos inventore dolor doloribus; eveniet eum id hic provident distinctio assumenda totam, autem in doloribus error minima sed animi. Sed nesciunt saepe odio et, consequatur incidunt non atque ex natus veritatis et atque facilis. Sint et omnis qui, maxime officiis ut cumque nostrum fuga blanditiis odio veritatis quis velit. Exercitationem autem, id quae aliquam consequatur vel enim non distinctio aut hic animi natus dicta;\r\nLibero unde repellendus et, voluptatem esse quos velit amet fugiat provident sed doloremque omnis illo. Laboriosam rem, est unde qui suscipit nihil consequatur assumenda voluptates ea deleniti eum sed incidunt; dicta magnam qui ut, dolores quis odit laborum deleniti natus quia quibusdam est ab voluptas. Veniam cupiditate voluptatem esse aliquid accusantium mollitia et id qui placeat quae sit est dolores; eaque non necessitatibus et soluta rerum qui labore laborum incidunt sed voluptates quibusdam molestias sit. Alias soluta ut quidem laudantium nihil quia ut excepturi eius ex sequi nihil debitis placeat; voluptatem ad aut ut tenetur inventore possimus ipsam, et quia ad repellendus quidem perspiciatis expedita. Ut cumque, tenetur dolor et cum et nostrum est ab aspernatur error neque nisi veritatis. Voluptatum suscipit totam quisquam nemo inventore id quidem totam vero dolorem et ipsam nihil minus; ad velit nam dolores ex cumque vitae dolores consequatur ut reiciendis omnis et libero quia. Quis quia dolores tempore est quis iste aliquam vero doloribus sit molestiae officiis iure nam.', 1, 27),
(7, '1NSGV-QT2R8-JS4YB-3VEFN-E32TM', 'Nam magnam voluptatem sint cumque, quia sed maxime error qui ut hic saepe quia iste. Aut eligendi, ut quia nisi tempore qui beatae omnis quo eum aperiam veniam qui et. Ea et assumenda exercitationem perspiciatis vero temporibus tempore totam eum rem nesciunt rerum voluptas ab. Expedita consectetur aperiam blanditiis iure omnis similique error enim rerum voluptatem aut voluptatem ad voluptatem. Accusamus ipsa et illum sit, blanditiis quia sapiente unde laboriosam eum ex error autem perferendis! At omnis voluptatem et consectetur, necessitatibus id quaerat est dolores incidunt dignissimos labore ut dicta; enim eaque porro sed ad voluptas sint eligendi cupiditate modi expedita veritatis dolorem hic sed? Excepturi iste asperiores omnis provident delectus repellendus ut vitae id est id sit itaque voluptatem. Sequi corrupti soluta natus quas ut odit sit nihil iure non, quibusdam pariatur tempore eos. Quis cumque impedit quos voluptatem est consequatur natus quaerat debitis error nam mollitia laboriosam neque. Eum qui et, harum nostrum magni error unde voluptas expedita sint dicta quis quia saepe. Voluptatibus unde perspiciatis voluptatem et neque aut rem quisquam doloremque est sint ipsam architecto qui! Sit iste voluptas ratione ab itaque vero sunt sed pariatur illum a neque soluta dicta; sit neque voluptatem eveniet architecto alias, illo et laborum cumque et vel deleniti distinctio eaque. Maiores sequi quis atque omnis dolorem sapiente molestiae dicta rerum aut numquam omnis aut qui. Ut perferendis quisquam sit cumque reprehenderit ut et esse qui sit sed ut voluptatem nisi. Quam voluptatem porro fugiat enim libero ducimus quae nisi eum earum vel porro aut sunt.', 0, 4),
(8, 'IAKA4-444YT-1J4AI-E8L3M-SL01Q', 'Iste perspiciatis ab quos commodi, ipsum possimus sint perspiciatis ex qui magnam et incidunt natus; ipsum illo et eos soluta commodi aspernatur facilis quis id autem aut voluptatem in ullam. Molestiae ut animi voluptatum ipsum est praesentium sit, tenetur optio obcaecati et sit quisquam totam. Qui corporis omnis saepe ut rerum minus aliquid ad accusantium neque eius aliquid minima vel! Unde et, adipisci sed est perspiciatis nihil corporis architecto sit dolor omnis consequatur officia in. Qui ipsum exercitationem beatae amet laudantium ipsam animi sit quod ipsam eveniet tenetur delectus autem. Blanditiis consequatur eos quia placeat maxime veniam enim ex unde iure perspiciatis veniam voluptatum possimus. Repudiandae eveniet natus sunt suscipit natus velit error in numquam quia ex voluptatem velit sed? Et vel sit quo, quis unde id ut autem omnis quidem perspiciatis facilis quia sed. Omnis eligendi quis autem architecto amet laboriosam quasi quam veniam voluptatem veniam dolorem officia dolorem! Ab accusamus sed porro quam deserunt unde beatae voluptatem eligendi beatae iste molestiae ut in. Culpa pariatur eius totam qui perferendis est nihil consectetur dolorum animi facere ea autem quisquam? Mollitia autem ut voluptatem impedit eaque enim minus consectetur, repellendus ipsum sit sunt corrupti eligendi. Doloribus harum id, dolorem rem labore inventore odio distinctio neque perspiciatis quibusdam libero reprehenderit recusandae! Totam corrupti velit ad, eligendi quisquam aliquam molestias ducimus vero est fugiat ratione consequatur voluptatem..;\r\nEius vel et rem magnam culpa itaque nisi nam dicta tenetur sint labore magni non; iste assumenda ea facere voluptatem consequatur porro maxime sit ut rerum ut voluptatum ea enim. Commodi exercitationem vel nulla consequatur nihil omnis inventore delectus vel aut vero tempora quia ipsa! Aut tenetur corrupti ipsam ipsum molestiae accusamus quia possimus saepe veniam est perspiciatis beatae qui.', 1, 23),
(9, 'S7OXV-Z89MK-QTLU5-3KZP9-5R65D', 'Praesentium dolore est iste molestias autem ut est qui ad fuga quaerat quia dolor culpa. Quo iste tempora vel aspernatur itaque sunt qui, voluptas eveniet vel ex ea impedit asperiores. Autem ipsum vero velit est tenetur labore aut doloremque et tempora molestiae temporibus cum vero. Eum a repellat optio omnis earum dolore quas reprehenderit laboriosam enim facere quia, perspiciatis explicabo? Dolor qui, sed tempore id quisquam magnam vero reprehenderit enim alias ad ducimus voluptatem iste. Quisquam aut, et rem pariatur cupiditate dicta sed enim quas cum vero saepe quibusdam et..;\r\nExercitationem odio sed odit et dolores cupiditate velit similique sunt ut totam magnam quis unde. Quo corporis ipsum sit omnis deserunt possimus voluptate dolores voluptas quis assumenda voluptatem esse nisi! Dignissimos commodi, non in dicta a dolores sint dolores error consequatur ad veritatis accusantium dicta. Quisquam porro aut quis ex iure excepturi magni esse est molestias unde eius doloremque iste. Non ea magnam rerum nesciunt tenetur consequatur omnis tenetur voluptates dignissimos eum excepturi deleniti provident! Harum dolor similique eaque illo optio praesentium nam reiciendis, nesciunt repellendus obcaecati quis repellendus sed. Voluptatem sed perspiciatis natus voluptatem error accusamus omnis enim porro quis amet dolor quia voluptatem;\r\nSit temporibus nisi nulla assumenda aut unde qui in est, sit molestiae rerum et fugit. Omnis et unde omnis temporibus est totam quaerat quia magnam perferendis ut beatae iusto vero! Ipsum fugiat quaerat et corporis, dolore molestias ea eligendi exercitationem eos sit fugit odit officia. Sed qui exercitationem perspiciatis nihil ut inventore molestiae optio quod incidunt velit enim voluptatem odit.', 1, 21),
(10, '8NQ2F-W693D-4MXJP-DLN8H-838A8', 'Cumque in ad velit dolor sequi rerum et corporis eum ut sit aut et unde. Perspiciatis beatae facilis, corporis iste voluptas neque iste quasi maiores debitis porro illum qui sit? Perspiciatis saepe totam natus voluptatem corporis ut rem adipisci vero a magni eius odio aliquam. Commodi iste ut nisi quia ab perspiciatis illo, recusandae autem illum incidunt sed quos est.', 0, 7),
(11, '66R80-VE9D8-V6025-O2001-K95AW', 'Eaque aut reprehenderit totam qui nam est labore voluptatum tempora sit qui laborum consequatur aut. Quis iste reprehenderit ullam quas sed reprehenderit fugit eos qui consequatur officiis accusamus ut inventore? Omnis ad id autem animi suscipit quia illo provident culpa unde mollitia at hic labore! Non sit, est dolore quidem recusandae esse illo voluptatem maiores laudantium in vel sit cumque. Dolores est, voluptas eaque exercitationem facere quam iste aliquam deserunt ut aperiam voluptatum voluptate nobis! Harum fugit dignissimos natus ut ullam dolore nesciunt, non labore minus suscipit atque quo quis. Asperiores iste natus temporibus deserunt et qui fugit autem deserunt fugiat inventore beatae consequuntur harum. Eaque sed a perspiciatis animi dicta qui aliquam omnis error cum reiciendis repellendus harum magnam? Voluptas est veritatis aperiam doloremque quia culpa dignissimos consequatur, sit praesentium voluptatum nesciunt sed eaque. Qui recusandae omnis iusto sequi quis quibusdam quo natus magni laudantium nemo in commodi et! Consequuntur id est consectetur reprehenderit aliquam officiis unde dolor et accusantium beatae excepturi corrupti labore. Repudiandae ab dolor dignissimos unde quia nostrum dolor atque est eum error repudiandae totam autem; et iste iure porro, aliquam est fuga qui blanditiis in temporibus magnam voluptatem illo sed. Repudiandae quis unde sapiente exercitationem aut ut eos sunt quam ea voluptatem quia voluptatem sit. Quaerat sit et sed corporis iure sit impedit culpa suscipit sit saepe eveniet nulla nihil? Dolore ut fuga culpa eaque et dolor dolores assumenda libero accusantium doloremque aspernatur et ut...', 1, 16),
(12, '034R2-9GT1Y-L81KQ-85O3Y-T32P0', 'Tempora cumque consequuntur architecto, aut ratione reprehenderit eum qui placeat sequi unde impedit officiis officia. Quod nisi obcaecati quia tempora beatae est ut porro tenetur omnis doloremque fuga explicabo est. Quasi ut non, illo recusandae ducimus temporibus tenetur culpa vitae modi ut sunt dolorem voluptas. Perferendis ut nam maxime consectetur sapiente et libero aut similique iure fugit beatae consequatur suscipit! Aut quia deserunt eaque quisquam ipsa quo corporis incidunt corrupti omnis quam commodi dolorem doloribus. Repellendus aut et minima ab reprehenderit quia tempore accusantium culpa fuga possimus ipsam sint quia;\r\nFacilis omnis aspernatur voluptas qui iste ut et blanditiis eum qui aperiam reprehenderit iste dicta. Delectus hic explicabo dignissimos mollitia illo libero provident quisquam, voluptas voluptatem vero id maiores ipsam. Reprehenderit voluptatem et perspiciatis accusamus dolorem repellendus, autem iste rem est aliquid eum qui est. Tenetur cumque dicta quis dolores eius perspiciatis nesciunt fuga tempora tenetur nostrum esse quia quo? Amet consectetur et nesciunt quaerat repellendus ipsam voluptas autem sunt sed iste molestiae minus tempore. Ut libero, soluta dolorem et aliquid odio omnis sit et id qui eum doloribus inventore. Natus omnis voluptatibus a saepe ea ad omnis fuga et ipsum ex magni id vel. Voluptatem id quasi, quos exercitationem autem perspiciatis pariatur possimus eveniet earum cum aspernatur et voluptatem!', 0, 18),
(13, '034R2-9GT1Y-L81KQ-85O3Y-T32P0', 'Tempora cumque consequuntur architecto, aut ratione reprehenderit eum qui placeat sequi unde impedit officiis officia. Quod nisi obcaecati quia tempora beatae est ut porro tenetur omnis doloremque fuga explicabo est. Quasi ut non, illo recusandae ducimus temporibus tenetur culpa vitae modi ut sunt dolorem voluptas. Perferendis ut nam maxime consectetur sapiente et libero aut similique iure fugit beatae consequatur suscipit! Aut quia deserunt eaque quisquam ipsa quo corporis incidunt corrupti omnis quam commodi dolorem doloribus. Repellendus aut et minima ab reprehenderit quia tempore accusantium culpa fuga possimus ipsam sint quia;\r\nFacilis omnis aspernatur voluptas qui iste ut et blanditiis eum qui aperiam reprehenderit iste dicta. Delectus hic explicabo dignissimos mollitia illo libero provident quisquam, voluptas voluptatem vero id maiores ipsam. Reprehenderit voluptatem et perspiciatis accusamus dolorem repellendus, autem iste rem est aliquid eum qui est. Tenetur cumque dicta quis dolores eius perspiciatis nesciunt fuga tempora tenetur nostrum esse quia quo? Amet consectetur et nesciunt quaerat repellendus ipsam voluptas autem sunt sed iste molestiae minus tempore. Ut libero, soluta dolorem et aliquid odio omnis sit et id qui eum doloribus inventore. Natus omnis voluptatibus a saepe ea ad omnis fuga et ipsum ex magni id vel. Voluptatem id quasi, quos exercitationem autem perspiciatis pariatur possimus eveniet earum cum aspernatur et voluptatem!', 0, 18),
(14, 'H96ML-T2NK5-FLBOW-2HU29-152HC', 'Harum et, incidunt iste explicabo qui numquam eaque perferendis assumenda accusamus aperiam sunt voluptatem est; tempora sed sint ut eum ab obcaecati beatae quas nulla et non qui error et. Iste incidunt unde et ut eum amet quia aliquid reprehenderit accusantium amet aliquam unde et. Inventore quisquam, aut animi amet ipsum minima laboriosam error aliquid aut magnam id possimus iusto. Sunt modi quasi perferendis iure autem unde sapiente totam magni sit magni adipisci quas vero;\r\nPraesentium eius voluptatem debitis blanditiis error et quod iure quia cupiditate voluptas similique voluptate numquam. Blanditiis at delectus, enim et consequuntur fugiat libero sed necessitatibus vel voluptas est quasi laudantium. Porro repudiandae eos blanditiis accusantium eveniet mollitia molestias quo aspernatur ut error aperiam repellat voluptatem? Error architecto inventore quis ex aut molestiae illum aut sit excepturi et aut quia fugit. Quia id eum esse sunt deleniti labore sit tempora id vitae quia sint perspiciatis tenetur. Quae eligendi earum voluptatum omnis quis corporis aut nemo explicabo recusandae, dolorem cum non magnam! Deleniti id natus obcaecati omnis, consequatur ad sit eveniet maxime quibusdam qui quis quia voluptatibus. Tenetur et eveniet et omnis unde consequuntur aut dolore ex qui sint qui et dolor. Quis voluptatem velit tempore consequatur adipisci aut omnis rerum sed provident rerum iste natus deleniti. Enim doloribus natus rem possimus exercitationem enim fugit amet quasi et beatae libero est quia. Minus error qui dicta rerum debitis, alias possimus sit enim autem iusto quibusdam nobis neque. Unde iste odio sit rerum dolor aperiam soluta perspiciatis molestias molestiae doloremque dolor fuga quas. Cupiditate vitae accusantium aspernatur error tempore quod dolores maiores sed et maxime explicabo ipsam omnis!;\r\nId voluptatem quam voluptate dolore molestias aspernatur fugiat doloribus est et corporis sunt voluptatem quisquam. Quis consectetur et, voluptas consequuntur rem consequatur ipsum sed ut quisquam quia aut nisi eveniet; quisquam commodi maxime minima facilis ut sunt nisi nesciunt consequuntur est earum aliquid odio enim. Ut et non quisquam eius non porro et nihil et aspernatur voluptatem sint sit laudantium. Modi maiores quasi quaerat, non soluta unde aperiam doloribus molestiae dolorem autem sunt maxime sit; ratione impedit et quia quo vero saepe nulla aut blanditiis sint laboriosam, quia voluptatibus autem. Neque nostrum et nostrum perspiciatis recusandae neque doloribus ullam, sed et quas qui quae natus.', 0, 10),
(15, '29D2L-66L05-UZOK8-FJRB7-631I7', 'Nam error amet est perferendis non ut sint omnis dolores recusandae sed incidunt nulla sint; cupiditate doloribus, consequatur soluta assumenda numquam natus perferendis corporis temporibus veritatis id beatae sint voluptas. Rerum aperiam sed doloremque molestiae voluptas ad suscipit sequi perspiciatis cum obcaecati quia et quia. Facilis est, repellendus minima omnis tempore corrupti aut ipsum veritatis et voluptate ab fuga expedita. Magnam soluta illum aliquam ea quia et sunt nemo voluptatem sed dolor doloribus quibusdam perspiciatis. Pariatur deleniti totam est qui ut placeat voluptatem magnam eaque suscipit beatae excepturi ut dignissimos! Hic consequatur eum adipisci eius ab id nostrum quis et iste distinctio perspiciatis est architecto. Praesentium iste, et laudantium atque eum tempore quis maxime rerum quia harum perferendis veniam iusto;\r\nLaboriosam natus magni unde voluptatem modi numquam eos unde numquam dolor distinctio error quo error. Et rem omnis sit non repellat sit omnis quis aut quos dignissimos a similique est. Adipisci aut vel natus labore et eaque optio dolor consequatur voluptatum blanditiis id quidem delectus. Sint saepe aut velit omnis qui consequatur officiis nulla eos eum quod libero illo nihil! Culpa numquam ut sit culpa error sint, recusandae voluptatem mollitia tenetur praesentium sed deleniti eius. Et minima aperiam ut repellendus mollitia voluptatem est ut maxime id odit aut repudiandae reprehenderit. Et adipisci non tempora voluptate dolores quod autem vitae non enim sint repudiandae qui deleniti. Amet totam temporibus voluptatem nostrum, qui alias itaque iste laudantium sequi consequatur nulla quas soluta. Repellendus nobis, magnam omnis neque ducimus reiciendis architecto quis perferendis numquam quas ea veritatis et; totam unde aliquam consequatur sequi iste unde dicta porro qui nisi sed eligendi quo illo. Rerum perspiciatis et illo, incidunt ipsum est eum suscipit nesciunt ex voluptatem dolorem nisi est? Nobis in praesentium omnis unde sed velit et iste veniam illum aut aperiam ut illum. Rerum natus hic qui odio autem culpa odio voluptatem est officiis numquam sit corrupti ut. Et non commodi sit autem natus aut natus doloremque a tempore ut est nisi nostrum. Ipsa qui ipsum consequatur suscipit velit aperiam nulla rerum est odit cum iste ab quos? Nostrum sit incidunt laudantium quia dicta ut ullam quod possimus est sapiente veritatis et quibusdam! Earum eum qui, quo unde quos autem natus reiciendis aspernatur officiis veniam et quo vero. Eveniet odit dolores commodi ad inventore voluptatem et at perspiciatis reprehenderit earum doloribus exercitationem dolorem! Veritatis sint obcaecati doloribus perspiciatis rerum architecto doloribus modi vitae sed modi sapiente dolorem sed. Itaque et, temporibus earum eligendi accusamus temporibus aspernatur voluptatem tempora laboriosam commodi velit adipisci veniam..;\r\nDolorem facere eveniet est ad necessitatibus, neque ut minima libero eum omnis itaque consectetur sed. Molestias vero dolor aut optio tempore omnis dolor est obcaecati tempora earum autem incidunt aut. Laborum quidem repudiandae accusamus aliquid in neque ea tempora praesentium dolor est sequi provident perferendis. Sed et, ipsam porro consequatur quasi tempora omnis sunt exercitationem harum magnam obcaecati quisquam magni! Iste voluptatem excepturi ad a vel at autem voluptatem laudantium earum est dolorem enim sunt. Exercitationem dolor explicabo ullam exercitationem animi ullam omnis consequatur voluptatem iste magni tempora ut error. Impedit error maxime numquam maiores veniam est consectetur quis quibusdam voluptatem deserunt unde debitis harum. Perspiciatis delectus fuga culpa perspiciatis omnis recusandae quos dolorem error tenetur dolore quam dignissimos omnis.', 1, 2),
(16, '7G4Z9-WY301-PV1D5-F93I7-IE9M6', 'Iste aspernatur iste numquam quo praesentium autem tempora omnis aut provident ipsam corrupti quae consectetur. Alias rerum impedit a natus tempore id accusantium qui pariatur, alias vel reiciendis ut ab. Dolores minima, iure ipsum inventore omnis ipsam enim facere temporibus iste modi veritatis voluptate molestias. Iusto architecto quia rerum ut ea nostrum assumenda ad enim quae assumenda omnis ut est! Et odit et unde nemo minima sed quos nisi laudantium esse maxime repudiandae velit vero. Omnis quia, sit asperiores sit cumque quam et ipsa facere voluptatem et incidunt quia possimus; sit aperiam cumque tempore facere accusantium sapiente natus officiis consequuntur qui maiores magni est enim. Voluptas explicabo unde quia necessitatibus id dolorem rerum sunt molestiae sunt necessitatibus labore suscipit saepe? Corporis iste illo hic recusandae debitis iste eos ea quia molestiae a perspiciatis error impedit. Quod quae enim eum quis quas non, quia sed neque vero beatae eum unde et! Et consequatur est ut rerum, est unde alias dolores doloremque sit facere id et labore; harum qui ea illo, dolores dolor sunt quae in nulla earum assumenda illum doloribus iste. Et eaque velit sapiente quo velit est, officia sed quas in nisi rem nesciunt perspiciatis.', 1, 6),
(17, '37U5J-739WD-LHSWI-6X09I-41BK4', 'Iure quia voluptates ut et sed eaque et possimus praesentium quia ipsum repellendus sint sed. Cum ut tempora quo accusamus, et ex qui expedita laborum rerum voluptatem alias quia sed. Excepturi sit et sit dignissimos, pariatur omnis modi et ea omnis sint id accusantium quia. Facere natus consequatur veritatis nihil cupiditate quis porro iusto amet sequi est qui voluptates praesentium. Veniam laudantium nobis culpa eaque qui aut quasi est saepe sint itaque consequatur et facere!', 0, 27),
(18, 'UQ955-Z5X1M-4L5US-B5H53-A1XTL', 'Quibusdam blanditiis qui iure et, aliquid sed unde quas voluptatibus et beatae doloribus unde saepe. Ab quo est, nobis qui eius illum ut dolores est voluptas suscipit laboriosam ex omnis. Ipsum nobis quaerat soluta natus consequatur sit laborum ut et voluptas laborum laudantium illum aliquam. Id eligendi sint necessitatibus quasi quae porro voluptas aut ad suscipit error natus nam et. Molestias itaque minima, explicabo quod voluptate omnis quis eius ut rem architecto dolor error praesentium. Voluptatem vel quo est rerum, exercitationem perferendis veritatis amet molestiae dolores nesciunt aut neque ea; enim quis ut ex consequuntur eum in, labore beatae cum architecto aut tenetur ad ut. Aut molestiae provident qui sit maiores eius molestiae, nam itaque minima fugiat delectus quae praesentium. Architecto asperiores, beatae mollitia voluptate velit culpa doloribus provident harum tempora architecto unde voluptatibus necessitatibus;\r\nIllo dolores, id et expedita aliquam odit exercitationem deserunt aut non voluptas quibusdam quo eum. Vel ut voluptas facere labore ipsa cupiditate veniam qui dolores animi quae eius unde vitae. Beatae perspiciatis eius omnis dolore, cum quis et deleniti in dolore consequatur saepe omnis quae. Deserunt nemo soluta qui, necessitatibus sunt libero quia ut est dolore ea at perferendis voluptas. Deleniti ut, veritatis quae sed ipsa asperiores rem ea placeat eligendi aut autem magni quae. Repellat quasi eius iste molestias dicta error et omnis ad qui corporis iste et earum. Sequi illo nemo qui impedit eligendi magni nesciunt voluptate beatae distinctio voluptas sit rerum ab;\r\nImpedit tempore in natus consequatur eius voluptates quia voluptatem ea illo nam ut explicabo ut. Cumque aut est dolore quo atque aut corporis enim hic quia asperiores magni pariatur sit! Error autem nihil laborum quo sequi adipisci impedit qui unde et perspiciatis esse est reprehenderit. Iste ut aut ullam consequatur ut id eum consequuntur aut repellendus natus ipsum necessitatibus voluptatibus.', 1, 8),
(19, '20U70-X8Q4T-186M3-D055U-Y1572', 'Doloribus dolorem quia, aspernatur nihil veniam odit quo doloremque numquam odit error ut qui nulla; facere porro officia ut et voluptatem et tempore quo rerum qui voluptate ut quis mollitia. Rem omnis non, omnis sed officiis omnis recusandae non sit rem perspiciatis quod nihil rerum? Et nostrum veritatis ut similique iusto voluptas incidunt nostrum sed voluptatem ullam quia ut facilis; perspiciatis qui porro a veniam et ducimus quo enim eos et hic ad consequatur reiciendis? Ut amet non, eos et alias neque explicabo quidem nesciunt qui ipsa aliquid suscipit commodi! Cupiditate est obcaecati, eos iste tenetur est soluta id eveniet est et aliquid doloremque porro? Natus vel ipsum hic harum quae id beatae molestias eos illo quisquam hic non ex; quam officia et officiis est id officia et, illo a possimus ea molestias assumenda deleniti;\r\nEum debitis, tempora sit quibusdam nam dolorem aut explicabo sequi atque voluptatem nulla distinctio quis;\r\nNihil repudiandae et sit dignissimos, explicabo sunt nam eum perspiciatis quod animi omnis placeat sed. Delectus dolor quia ut cum totam magnam ea earum nostrum dolorum nisi ex voluptatem omnis. Error amet placeat velit sit voluptatem est velit amet unde autem nemo iste ipsa dolorem! Voluptatem voluptas soluta ut sit in quas ut voluptatem ullam molestiae est quam ex cupiditate. Unde sed ea recusandae, dolores illo aut iste beatae sit voluptas sequi corporis voluptatum ipsum. Consectetur nihil perferendis aperiam laudantium tempora consectetur at sit doloremque ut odio sint nobis necessitatibus! Consequuntur illo laudantium dolores ut ipsum totam ipsa minima qui sed, minus ipsam non porro; sequi quasi eos aut fugiat vero cum natus totam recusandae magnam quos in rerum vitae. Magni et praesentium nesciunt, veritatis natus sit maxime ut officiis non illo ut sit illo. Pariatur nam omnis nulla cupiditate quaerat eligendi libero est accusantium praesentium laborum unde vel nesciunt! Nobis facere unde dolor repellat exercitationem accusamus aut ipsum provident aut nulla aut eveniet laboriosam. Quam aut vel molestiae repellat eveniet sunt sapiente exercitationem fugit dolorem nam ex eum quis. Consequatur quaerat autem repudiandae odit rerum sequi dolores architecto ut perferendis maxime ad est corporis.', 1, 11),
(20, 'BZDRD-862AO-KJH2T-6B03Z-FC0QU', 'Non voluptas unde fugiat voluptas ut exercitationem et beatae omnis sit enim suscipit ut laborum. Voluptas non saepe aperiam dolor laborum iste porro animi odit aut aspernatur praesentium quasi culpa. Qui minus aliquam ipsam repellat veniam nemo natus et ut omnis harum aut iure optio. Distinctio aliquid voluptatem, magni expedita vel doloremque voluptate iure et omnis sed pariatur quod molestias. Quas in saepe soluta commodi et qui ut eligendi est odio possimus aut reprehenderit ullam. Ut illo suscipit nisi quisquam est eaque dolores molestias ratione saepe unde minus reiciendis quam? Porro excepturi voluptatem consectetur perferendis ut tenetur vero voluptatem debitis consequatur autem sed ea error. Aut incidunt, omnis deserunt iste et deleniti nam consequatur sed excepturi autem ut placeat quasi. Atque exercitationem repellendus neque natus ut dolorem, inventore quod autem qui velit quaerat omnis quibusdam. Quis ex alias, natus hic saepe sed excepturi qui at id velit iste repellat quis. Omnis doloribus tempora facere sit quia omnis incidunt corrupti saepe aut impedit ut voluptatem in! Consequuntur consequatur fugit minima facere et consequatur debitis ipsam placeat sunt ab voluptas veritatis sit. Tenetur amet sed itaque, est nihil provident consequatur fugiat deleniti qui vitae magnam iste fuga. Sed dolorem laudantium, aut totam nostrum voluptatem quia quaerat consequuntur et asperiores hic esse ipsa. Sit veritatis omnis doloremque distinctio quam obcaecati consequatur praesentium officia dolorem ut necessitatibus sequi et? Enim qui sed aut laudantium qui unde quia ut et iste est neque ea necessitatibus. Repudiandae minima eum et ut laudantium maxime sit dolore aliquam id earum praesentium facilis laudantium? Cupiditate consequatur voluptatem nihil vitae eum sequi voluptatum, rem fuga nobis sed debitis culpa sit! Quod corrupti sit blanditiis dolor laudantium iste delectus ut et iure culpa voluptatem necessitatibus quia? Omnis fugiat sed aut hic ea quia rem nobis accusantium, qui sit velit quia eum;\r\nEt ea dolore quo nemo neque sit ipsa esse quia tenetur fuga ut alias quia. Non sapiente qui, molestias inventore blanditiis est ad asperiores voluptas aut blanditiis velit voluptas qui. Est illo alias deleniti eveniet et reprehenderit accusantium voluptatem et ipsam ipsum voluptatem obcaecati labore. Fugit rem nihil, voluptas enim a maiores est non veritatis hic error quibusdam quam quia. Dolorem ea error officiis dolorem modi ut nesciunt assumenda inventore explicabo provident unde vel et.', 1, 24),
(21, 'B5I4V-SEY15-SIA81-FH6LP-F7OY5', 'Id sed dolorem omnis iste omnis voluptas nisi repellat, nemo est officiis ipsum deserunt voluptatem. Nemo non ullam vel, at aspernatur illo labore rerum maiores sit voluptatum molestias voluptatem sint! Earum reiciendis, sit ut et maiores ea alias dolorem sunt dolor aperiam sed delectus nostrum; sit laboriosam sit fuga et quo accusantium necessitatibus aspernatur aut aliquid error et consectetur minima. Ut molestiae et voluptas sed quam sed sit sapiente cum dicta sed laborum et aut. Facilis non consequuntur rerum consectetur aut sit placeat corrupti perspiciatis aspernatur recusandae id voluptatem ea. Nostrum qui dolorem soluta, nesciunt dolorem voluptatem ut obcaecati quia aperiam natus nam ut quaerat? Ad qui, eos sunt rerum et nemo est ut corporis omnis iste obcaecati voluptas quos. Corporis rem et ut quis aperiam consequuntur velit quia repellat ad nostrum laudantium quo debitis. Vel hic, et placeat esse eum reprehenderit eius enim voluptatem impedit et eveniet id est! Ut omnis delectus et atque non dolorem neque exercitationem quidem ut vel et inventore architecto? A quia, ut quibusdam adipisci nihil quaerat recusandae quia autem expedita sit ut sed quasi. Obcaecati voluptatem maiores natus quia voluptatum, doloremque dicta cumque perferendis rerum et cupiditate vel esse! Tempora nihil reiciendis cum reiciendis quos culpa impedit dolorum earum cum et error eos expedita; nemo nihil commodi praesentium sequi sed suscipit nihil repellat, accusantium labore quia possimus et doloribus. Maxime fugit facere dolor voluptatem tempore exercitationem quia sit corporis odio, quia consequatur eaque commodi. Et in non, aspernatur maiores voluptas cumque et unde quasi ullam placeat eaque natus et; dolores iste et fugiat perspiciatis, unde autem consequatur laborum ut nemo provident eius accusamus est;\r\nFugiat a voluptatum ea voluptate omnis dolores fuga ex eius impedit facilis laudantium perferendis nisi; non magni eius sed non sequi omnis est consequatur explicabo itaque et aliquam quia sit. Perferendis odit laboriosam maxime et quaerat eos eius commodi est dolores vitae assumenda voluptatem est! Tempora reprehenderit ullam sunt eligendi voluptatem adipisci aliquam commodi repellendus autem sapiente voluptas architecto voluptas. Voluptatem sed et quae velit maxime delectus qui aspernatur nostrum voluptates temporibus eius consequatur architecto. Magni quia sequi autem ea alias ut nisi est necessitatibus consequatur quia ut autem quaerat! Officiis praesentium soluta consequuntur iure voluptatem sapiente incidunt aut recusandae quia consequatur autem odio architecto. Ea sed laudantium adipisci totam sed eligendi nam impedit rerum harum eligendi omnis iure et; et voluptatem commodi quia omnis impedit praesentium voluptatibus aperiam qui quia delectus qui unde quo? Tempore qui incidunt, esse nemo in omnis sit sed natus ullam dolorem excepturi eius vitae. Perspiciatis amet at, voluptates modi rerum et qui unde aliquam consequuntur minus nobis voluptas nobis? Quia quis iusto obcaecati mollitia numquam ut inventore ullam sed unde consectetur unde quibusdam porro.', 1, 3),
(22, 'F2AR4-1G709-KYH66-048ZO-4661T', 'Qui in error commodi dolore iste sit aliquam ut beatae iste aut natus libero voluptatum. Sunt ut ad ex, consequuntur enim vel modi sunt omnis unde ad exercitationem facilis quis! Fugit maiores pariatur enim sit minima facilis aspernatur ad cupiditate est natus omnis vitae esse. In quidem eius atque quibusdam asperiores nesciunt totam exercitationem magnam alias voluptatum est sed qui. Laudantium vel ea est nam quae doloribus aliquam aut est repudiandae ab qui id natus; tempore minus natus ut quam ducimus maxime ut nam perspiciatis aliquid cum delectus iste architecto. Aut totam tenetur illo aspernatur explicabo, obcaecati nesciunt quod cum ut ullam quisquam et sed!', 1, 2),
(23, 'AK27T-HPDOD-A6P08-0S33K-5XPQA', 'Tempora eius molestiae vero quia facilis saepe, alias sed quisquam nihil eos aut perferendis accusamus. Molestiae facilis, quis consequatur est odio laboriosam fuga nihil qui vitae tenetur earum magni qui. Magni qui sit necessitatibus natus accusamus molestiae voluptatem similique error consectetur id sit voluptatem eos! Iste nisi velit, id a aut hic autem qui dolorem eaque autem fugit error corrupti. Voluptas et ex placeat qui perspiciatis architecto assumenda sed provident, velit sit reiciendis sed explicabo. Sed est ut explicabo rerum iste ad molestiae qui fuga voluptates aspernatur minima aut consequatur? Voluptates odio ut enim aut voluptatem beatae unde rerum dignissimos delectus in omnis est repellat. Voluptatem id nisi fuga voluptatem id doloribus necessitatibus et voluptatibus dicta quae distinctio architecto iste;\r\nTotam nulla cum amet consectetur quia perferendis id provident libero sit ullam temporibus molestiae quis. Et quis qui consequatur labore dolore sed veritatis harum temporibus voluptas cumque voluptatem sit corrupti! Ut similique, aut nisi ut dignissimos sit nihil aut fugit quia porro autem ut quas. Suscipit quaerat maiores aut quia est cumque hic dignissimos vel ea consequatur iste aut omnis! Molestiae aut at excepturi repellat deleniti in vero enim similique odit id odio sed provident. Doloremque totam perspiciatis sed earum tempora omnis delectus labore tenetur rerum, numquam sed labore dicta! Soluta sit sequi, itaque dolorem ipsum et omnis similique consequatur quia doloribus dignissimos sit et. Obcaecati itaque est obcaecati ipsa voluptas ratione dolorem dolor ad eum ut provident alias enim. Neque error laborum magni cumque voluptatem minima earum esse est asperiores quia natus repellendus fuga. Tempore ipsum voluptatem, aliquid porro natus cumque doloribus harum ipsum vel aspernatur maxime asperiores praesentium. Sunt voluptatibus ea sapiente aut non, suscipit rerum quasi voluptatem impedit quis officia aliquid iste? Molestiae aut et eos aliquam aliquid quis repellat molestiae nemo error veritatis et dolor repellat. Ex voluptatem voluptatum corrupti ipsum architecto asperiores unde est ullam adipisci corrupti dicta autem inventore! Voluptates quae incidunt delectus vitae omnis quam commodi ducimus aut vel quas odit error quae. Cumque laudantium aut qui, consequatur unde veniam iste fuga aspernatur debitis culpa esse placeat quia. Qui eaque omnis est recusandae voluptatem dignissimos sequi qui aspernatur nostrum reprehenderit enim et ipsam! Velit consectetur recusandae temporibus libero velit a inventore quo dolores qui aut quaerat velit optio. Id perspiciatis doloremque et aut sunt ut qui ut id at distinctio unde similique ut. Qui dolorum quaerat et a dolorum sint necessitatibus, tenetur et ratione atque eaque sint ullam.', 1, 19),
(24, '7LDC7-EWXP6-OR8L1-P3F9P-CVPB9', 'Beatae ullam dicta ut aliquid qui ut voluptatum possimus magnam consequatur eaque voluptate eos quis. Iste aut ut omnis officiis magnam voluptatem nemo est quia delectus et recusandae minus consequuntur! Esse qui dolore ut et perspiciatis soluta est recusandae laboriosam velit voluptas nisi tempore at. Exercitationem ipsam aut ipsam ut excepturi repellendus iste ipsa et unde libero corporis deserunt quisquam; enim optio non aliquid unde natus quis est iste optio distinctio numquam nostrum temporibus voluptas. Iste reprehenderit veniam unde dicta mollitia laudantium aliquid eius laboriosam dolore et eveniet nemo non; ut nihil rerum molestiae reprehenderit cumque perspiciatis eos impedit eum id laboriosam libero inventore quo. Qui nemo accusantium deserunt magni eaque non est eaque labore quis natus est veniam voluptatem. Et aspernatur corporis modi placeat ut eum ipsam voluptatem expedita minima officia pariatur molestiae et! Quo officiis incidunt qui ut maxime voluptatem, sapiente aliquid praesentium error optio accusamus quas rerum. Et quo eveniet sit quis, molestiae eos cupiditate sint aperiam corrupti qui fugiat ipsam sed; iste maiores molestiae vitae natus autem voluptate accusantium cumque non expedita debitis iusto dignissimos sint; suscipit ullam et velit est nostrum sit fuga et fuga repellat mollitia cupiditate asperiores dolores. Non modi sit ipsum sed nihil consequatur obcaecati eligendi qui consequatur accusantium voluptatem sunt magni; sequi delectus iste aut ipsum veritatis eligendi aliquid, asperiores neque iste libero voluptates sunt ex.', 1, 7),
(25, 'Z6569-8BG56-Q8V1J-P0P19-M768B', 'Aliquam fugit recusandae quasi cumque enim possimus et maxime omnis accusamus laborum unde in quisquam. Numquam commodi alias omnis obcaecati reprehenderit aperiam praesentium est illo dolorem tenetur totam sint labore. Explicabo nulla sequi qui tempora sapiente numquam aperiam voluptatem, accusantium mollitia illum ut et exercitationem. Et dolorem reiciendis exercitationem quia, dolor praesentium dolorum dolores blanditiis sint iste ullam dicta excepturi! Alias repellat molestias est commodi porro nisi eius reiciendis voluptatem molestiae ducimus aut qui sapiente. Assumenda quas et eligendi vel iste fugiat debitis deserunt vel sit quo amet dolorem ea. Itaque et doloremque voluptatem qui quidem debitis corrupti voluptatum porro distinctio minima omnis temporibus officia! Sunt perspiciatis id dicta placeat repudiandae quia, quae totam non possimus accusamus ea sed et. Qui omnis qui et voluptatem velit, quasi quia eos eaque animi rem quibusdam iste nostrum. Illo ut labore amet quisquam ab dicta itaque eligendi recusandae et repellendus et eius non!', 1, 21);
INSERT INTO `products` (`id`, `product_name`, `description`, `is_deleted`, `category_id`) VALUES
(26, '20HG8-8RXG1-22G15-76RL2-O6QD2', 'Nam autem unde temporibus est exercitationem vero consequatur culpa tempora possimus totam qui commodi natus; ut in rerum velit unde qui natus illo ut accusantium nostrum porro veritatis non temporibus. Totam unde impedit, natus eaque laboriosam ut molestiae iusto molestiae sint est natus cupiditate quae!;\r\nCumque omnis aliquam quia facere rerum id architecto aperiam, dolorum quisquam nihil consequuntur aut est. Aut dolores temporibus tempore nostrum, iste omnis voluptatem impedit quisquam ratione eaque excepturi natus explicabo. Provident recusandae temporibus voluptatem error nisi expedita ut voluptates, et rerum sed maxime voluptatem amet. Vel ipsum non, perspiciatis unde sed praesentium et dicta in unde aut corrupti voluptate sit! Voluptatem est architecto molestiae culpa dolore omnis consequatur velit cum qui provident explicabo repellat perspiciatis. Et iusto rerum, omnis provident enim dolorem dolores vitae quam illum deserunt qui nostrum molestiae. Consectetur natus culpa perferendis quaerat sed et nesciunt ea minus, voluptatibus quisquam non distinctio assumenda;\r\nAlias obcaecati consequuntur ex sit sed hic quidem et reprehenderit quidem quo qui aut est. Quo esse aspernatur animi quia maxime eaque, sed nulla officia consequatur voluptas inventore eius expedita? A ab cum est aut reiciendis, quas nihil quaerat dolor autem cum praesentium laborum tempore! Dolor porro saepe voluptatem architecto pariatur quia et repellat ipsum consequuntur natus eos sed perferendis. Eos et omnis qui minima et, iste beatae odio rem ad maiores quis necessitatibus sed. Non nam unde aut magnam veniam quasi omnis voluptatem cum impedit delectus reprehenderit porro minima. Laboriosam est natus quod, reiciendis quod sint laborum laudantium delectus ad dolorum et est eum. Rerum sunt debitis minima harum a eaque error et illo sed qui corporis consectetur dolorem. Unde omnis porro adipisci quae laborum accusantium ea unde quod aut doloribus nisi et incidunt. Voluptatem quia quae modi consequatur dignissimos adipisci, quam consectetur at repellat ut placeat cum debitis. Et rem eum porro reiciendis totam consectetur magnam molestiae voluptatem qui incidunt voluptatem accusamus adipisci! Architecto rerum earum autem vero, accusantium aperiam tenetur nobis maiores nihil dolores voluptatem sed consequuntur. Repellat repellendus maxime, dignissimos quasi magnam non officiis consequatur ut soluta sapiente dolor quia aut; repellendus earum incidunt, et suscipit eum animi esse ipsum nulla veniam debitis et veritatis exercitationem. Est blanditiis sequi ipsum numquam iste sed totam repudiandae aut quia facere iste qui ex.', 1, 10),
(27, 'U531D-D3VA6-N0H67-V2QW5-PY6TK', 'Sint hic, ea consequatur qui et nobis cumque aut qui suscipit autem et maiores quam. Omnis ut aut, rerum culpa consequatur exercitationem unde eum deserunt at architecto odio quis est! Harum error quod, enim explicabo perspiciatis iusto in aliquid sit sed est id omnis non? Illo aut nobis quo necessitatibus sit hic provident fugiat incidunt similique voluptatem voluptas sed qui. Minus praesentium sint non laborum soluta ut sed rerum sequi modi numquam laboriosam dolorum ullam. Quia ut, autem velit voluptatem rerum labore ab fugiat qui ut sed saepe accusamus voluptatem. Aut natus possimus ut unde nihil quibusdam distinctio quo natus quia sunt aspernatur nostrum minima. Veritatis sunt doloremque sed quo iusto natus velit rerum necessitatibus iusto obcaecati commodi iste mollitia! Iste obcaecati ea tempore rerum reprehenderit quo non nam et dolorem sunt, soluta dolores aut. Ut et atque illum hic sit sequi et quo consequuntur hic vitae id eius debitis. Rem suscipit libero dolorem, magni consequatur reprehenderit voluptatem rem laborum necessitatibus suscipit nemo rerum commodi? Consectetur omnis harum deserunt et perspiciatis amet ipsum eum in, qui ab molestias ipsa est. Hic repellendus iste dolor voluptatum sit laudantium eaque et hic in natus dolorum quis ullam! Facilis ut molestiae dolorem sed consequatur possimus et numquam, voluptatem fugit ut repellat et quam;\r\nUt qui modi cumque et eum ducimus ut corrupti odio harum commodi aut est obcaecati. Et est voluptatem magnam, officiis rerum modi iste placeat qui sit enim blanditiis recusandae quia. Id fuga voluptas voluptate facere ut quae dolores et libero, voluptatem perferendis veritatis rem veritatis? Reprehenderit sit quia rerum eum maiores voluptatum soluta totam perferendis dolore repudiandae sed non aperiam.', 1, 1),
(28, '82RJ8-3525H-Z12Z5-MFQRT-082OP', 'Esse maiores voluptates facere ad voluptas autem perspiciatis rerum consequatur sit voluptas sed quas ullam. Aut pariatur sit temporibus nostrum quis aut sequi saepe temporibus rerum asperiores distinctio perspiciatis inventore. Optio nulla labore minima ab illo non est quia et consequatur tempore suscipit amet consequatur. Officiis sunt, qui sint perspiciatis aut eos modi in quod voluptatum perspiciatis at necessitatibus ut. Numquam ea omnis soluta deleniti et omnis laudantium tempore quidem consequatur sit laudantium rerum ad. Quas sit possimus quo qui expedita repellendus aut quis commodi labore est rem eveniet animi? Quae et consequatur odit est quo molestiae sit aut et odio culpa modi voluptatem unde; qui minus asperiores sed, blanditiis molestiae magni reprehenderit rem dolores veniam est omnis voluptas nulla. Rerum impedit unde ea quam vel repellat qui et non ut aspernatur architecto quia consequatur. Facilis unde praesentium inventore ea qui commodi numquam repudiandae esse totam molestiae blanditiis reiciendis omnis. Mollitia dolor obcaecati voluptas pariatur quos veritatis natus eligendi id aut animi repudiandae atque iste. Molestiae natus harum est nulla excepturi assumenda ut nostrum doloribus nesciunt et fugit cumque in. Corrupti exercitationem quia assumenda quae sed quia sed est veritatis nisi doloribus facere cupiditate ut. Incidunt suscipit amet natus aspernatur quia, animi voluptatem sed deserunt et voluptatem ut quam et..;\r\nEaque quas dolor ut repellat voluptas quas incidunt qui tenetur iste rem unde nisi debitis; sit numquam non qui est ex unde neque placeat sint distinctio eos culpa ut vitae. Recusandae adipisci illum distinctio officia quod aut maiores error obcaecati harum distinctio aut eum vel? Non voluptas voluptatem reiciendis error inventore omnis, dolore voluptates consectetur nulla libero et ipsam ut.', 0, 23),
(29, 'Q3NDV-12E30-LUC40-GN1QR-Q6E4W', 'Ipsam perferendis non iusto in illum quo rerum sequi ipsam quibusdam veritatis qui modi blanditiis. Enim officia perferendis, hic omnis consequuntur vel laboriosam ut consequatur ab quis similique et laboriosam? Ratione non, necessitatibus ullam voluptas nesciunt soluta accusamus sed et voluptatem atque dolor eius consequatur. Qui laudantium consequatur debitis totam debitis accusantium quos sint beatae incidunt laborum pariatur illo incidunt! Similique quisquam unde sit sint, maiores qui unde qui molestiae impedit optio ea qui reprehenderit;\r\nVoluptas aut est quis maxime nesciunt eligendi pariatur et suscipit veniam optio adipisci quos quia; vel enim ad aut nulla, nisi corrupti eius harum debitis rerum recusandae et facilis dolorem. Qui dolore architecto dolor ipsum aliquam ad ea iste vel sit est et sed architecto! Sequi praesentium vitae reiciendis ullam animi velit quisquam praesentium officiis placeat et in voluptas voluptatum. Sed vero perspiciatis excepturi repudiandae dolor omnis sit saepe est laborum qui voluptatibus magni nihil? Ut veritatis non sed, a neque doloremque tenetur et facilis quia inventore aliquid expedita soluta; deserunt dolor, veniam voluptas sed obcaecati qui et qui unde amet quia delectus natus unde. Culpa voluptatem quo pariatur in vitae qui, laboriosam sit culpa sed accusamus vero omnis ea! Iste magni, natus ut qui ut nisi inventore rerum laudantium perspiciatis eligendi voluptatem ipsum quo. Qui praesentium est libero consequatur sed ut, officia doloribus ducimus modi et eius ullam culpa. Fugiat placeat aspernatur eveniet, voluptatem explicabo officia pariatur perspiciatis quo dolorem odio molestiae rerum architecto! Praesentium consequatur sint repellendus quia modi velit mollitia eligendi enim et incidunt nostrum eaque quia? Labore quisquam ipsa, dolore doloremque accusantium unde quas recusandae sed quae dicta quis consequatur molestias. Quae vero provident iste inventore asperiores obcaecati natus iure et dolores, delectus quae perspiciatis rerum! Quia asperiores voluptas perspiciatis sunt ut sunt, deserunt est sequi officia quibusdam rerum iste eius. Libero sint et odit rerum, ipsam et ab quidem et fuga in sit aut nobis!;\r\nLaborum hic est vel quia tempora officiis inventore aut quae est et unde qui et. Atque necessitatibus sed voluptatem, ut adipisci omnis sed quis qui dolores veniam laborum alias qui. Ut id unde natus, quia ut harum accusamus repudiandae omnis excepturi rem obcaecati explicabo amet. Culpa ab id iusto ducimus ut quas suscipit dolorem ut laboriosam a neque quaerat unde. In labore perspiciatis quidem laboriosam esse quo dolorem eum voluptatem voluptatibus doloremque molestiae voluptatum consequatur? Et sit, voluptas ipsa porro voluptate et dicta quae cupiditate ea minus esse eum aut. Ut ipsa, illo nam perferendis a incidunt explicabo cum labore provident officia perferendis sunt blanditiis. Omnis non quia incidunt nemo perspiciatis hic molestiae illo voluptatem iusto laudantium ullam debitis necessitatibus. Perspiciatis quisquam est atque sunt, id nihil nobis labore excepturi quis eaque eos quae non! Voluptatem ex, quia eos libero et laborum qui et ut doloribus qui deleniti adipisci voluptatibus; est beatae corrupti sunt excepturi vel repellat voluptatem maiores qui cumque laudantium quos tempore eaque. Ut quasi recusandae reiciendis voluptatem soluta nihil facilis dolor inventore velit qui, quidem recusandae error! Voluptatem eligendi est neque incidunt nemo temporibus molestias incidunt unde error in velit eos ipsum.', 0, 30),
(30, '979F8-01NM9-IXTNB-6TO0Y-B50S1', 'Consequuntur nisi repellendus natus qui ea distinctio qui sed exercitationem qui sunt est iste nihil. Quis illo sequi dolores eligendi perspiciatis accusantium doloremque et sed fugiat repellat quo iste voluptatem; est beatae culpa quia enim reiciendis amet ratione cum culpa expedita qui sit aut dolor.', 1, 28),
(31, '75L59-SS1IS-3U222-J6ZX0-V7149', 'Qui corrupti reiciendis mollitia sit alias natus dolorem, alias ipsa earum vel et sed voluptatem. Quam omnis vitae voluptatem non consequatur laudantium est repellat impedit voluptatem dolores quasi consequuntur et? Dolores reprehenderit, aperiam et aut omnis inventore at a aut ut doloremque assumenda illo corrupti. Nesciunt voluptatibus unde dicta aliquid nisi est excepturi accusamus rerum accusamus nisi ipsam illum voluptate! Id iste non atque odit ut, quis maiores voluptates quo molestias quibusdam alias sit cum. Magnam unde possimus amet in nam non aut natus vitae eum quia voluptate voluptatem qui. Voluptatum sunt illo est aut omnis nostrum eveniet quo adipisci culpa adipisci voluptatem ut voluptas.', 0, 30),
(32, '02Q9Z-8W4VC-87ZO8-6RKC9-FAMWH', 'Dolorem fugit in explicabo rerum omnis aliquid quia earum qui voluptatem cumque aliquid vitae labore. Sunt officiis doloremque neque qui commodi error cum, unde reiciendis explicabo reiciendis asperiores nobis vero! A nam iste, est et corporis suscipit nesciunt unde excepturi deserunt optio debitis dolores sit. Quia voluptatem rerum quisquam alias quos molestiae amet ut eius molestias accusamus et voluptate aut. Voluptatem quo nisi error voluptatem inventore voluptatem nobis, itaque accusantium et illo et est voluptate! Quidem adipisci obcaecati autem, inventore rerum ea consectetur iste odit autem iusto quos ea laborum. Cum est, inventore assumenda et voluptatem aut a dolorem vitae aperiam natus iste assumenda est;\r\nVoluptatem ab eum vel et, eligendi culpa totam veritatis numquam accusantium ut qui voluptate voluptatem. Sed sit reprehenderit voluptatem accusamus et aut et sapiente blanditiis dolores officia dolores beatae ut. Enim aut, sed dolores voluptates laborum qui rerum voluptate ut dolorum et ipsa rerum nisi. Voluptatem ut omnis voluptas repellendus aut et nesciunt ipsum ut, officia aut nostrum aspernatur tempora. Eum et qui debitis ut quis quos sit modi inventore numquam, corrupti quis magni enim. Sit nulla atque illum distinctio ad eos consectetur illo et asperiores omnis ipsa molestiae rerum. Ullam voluptas soluta voluptatem facere repellendus modi laudantium rerum ut qui sit pariatur corporis omnis? Exercitationem et ut laborum et quibusdam magni suscipit sit ea dolor eius error nihil suscipit. Deserunt ut nihil, est iure eum quas sed vel possimus minus iure ex magni asperiores; laboriosam iusto aperiam quia sit nisi iste reiciendis aut impedit placeat aut iste aut quidem. Sed aliquam esse laborum et eos omnis molestiae tempore quas dolor alias laborum ad voluptatum! Nobis aliquam commodi rem suscipit voluptate aliquam perspiciatis et qui culpa dolorem et nostrum dolorem. Perspiciatis aliquid nihil consequatur quo aperiam omnis fugiat dolor voluptatibus, alias natus magnam voluptatem dolores.', 1, 11),
(33, 'F71PM-8V65U-4K14B-HR1C1-RP954', 'Facilis non sed dignissimos corporis, quo sed non ipsa error sed amet dolores ipsa est. Voluptatem asperiores enim, architecto aliquid aperiam itaque eum itaque sit incidunt rerum est sit earum! Aspernatur et odit ullam nemo delectus id rem error qui culpa consequatur repudiandae aut earum; harum ad, fuga maiores aliquid omnis soluta reiciendis voluptas quidem omnis temporibus excepturi in sit. Ut cum mollitia, itaque culpa est vitae sit voluptatem eaque consequatur dolorem rerum eaque est! Totam qui adipisci perspiciatis eos veniam culpa voluptas perferendis modi nisi ab error iusto cumque. Quo non quas ea reprehenderit rerum dolorem eaque optio ut non sed nisi officia sint! Doloremque ut fuga iste nemo, error aut voluptatem et sed maxime praesentium rem ut dolore. Adipisci ipsa commodi ipsa laboriosam est sit dolorem consectetur deserunt quia sint similique id numquam! Quo aut itaque qui quos sit sequi omnis in rerum voluptatum porro autem laudantium voluptas. Numquam aliquid laborum, labore ab voluptas voluptatem consequatur doloribus natus sapiente saepe error itaque ipsam. Et eos ea voluptas qui amet tenetur laborum sequi perferendis perspiciatis ipsum autem quidem quis! Laboriosam cum labore magnam sit sequi voluptatem iste ea culpa voluptate nulla maxime quia similique. Autem dolores omnis mollitia nesciunt qui laboriosam enim unde quaerat cumque maiores quo rerum ut? Quos esse illum, placeat qui aut debitis odio consectetur perferendis deserunt ut aspernatur a voluptates. Deleniti voluptatem culpa omnis corrupti eligendi consequuntur quis est perspiciatis corporis non doloremque repudiandae nisi. Voluptatem mollitia eius aut animi eveniet architecto ut voluptates et recusandae perferendis eos cum facere. Architecto necessitatibus et dolores sit iste, sint dolorum odit magni doloribus repellendus obcaecati fuga et! Consectetur mollitia impedit accusamus deleniti officia et quia odit, et eos maiores voluptas voluptatum temporibus.', 0, 22),
(34, '8AXL5-6RM66-94I7W-68TO6-R78G8', 'Facilis hic provident quasi, inventore sunt ipsum quasi maxime qui eaque sint iure natus omnis;\r\nPariatur et ex cupiditate impedit cum sint eligendi aut cum perspiciatis at non perspiciatis doloribus. Rerum beatae harum voluptatem sint tempora quam neque dolores voluptas perspiciatis sit temporibus voluptatem omnis. Hic sed ut provident eius quo dolores ut accusamus laboriosam impedit dolorem est rerum temporibus. Dicta eos nemo, possimus est asperiores dolor voluptatem qui eligendi officiis consequatur neque repudiandae aut! Et unde commodi tempore voluptatem tenetur cumque incidunt iusto corrupti nihil alias dolorem eveniet nisi. Dolor recusandae velit omnis, natus aspernatur aut natus et corporis dicta qui ut distinctio esse! Nobis eaque non exercitationem ex voluptatem velit tempora officia debitis error perferendis sed aperiam est. Optio et at qui ut quas ut velit et qui sapiente quo error quibusdam aperiam;\r\nVelit sed et error quae magnam repellat ut obcaecati ut iure iste aut quis voluptatem. Incidunt et unde inventore dolore rem cumque incidunt ex dolor velit exercitationem sunt aut nobis. Ea dolor quidem iste id eos suscipit sunt sapiente neque eaque quam et aut odio. Exercitationem voluptatem vel natus culpa, incidunt velit dolor error omnis impedit hic sapiente rerum est; sit repellat maxime et dicta dolorem non maxime quae eos libero impedit temporibus aliquam ea. Omnis quae, omnis et qui repellendus aut quae consequuntur aut perspiciatis voluptatem quibusdam eveniet quaerat; eius dolorem numquam ut velit ea quae quam consequatur eum sunt voluptatum iure eaque dicta. Unde ducimus optio expedita omnis cumque eligendi commodi quod fugiat molestias nihil quia quis eius. Minima quaerat tempore corrupti velit exercitationem ea aut omnis dolorum unde sint et eum earum; nostrum tenetur temporibus, eaque et voluptatem ea adipisci ipsam qui dolores sit quod nobis omnis; quis non velit eos totam quaerat ex, consectetur et vero eum nisi eaque perspiciatis facilis. Suscipit quo quis sed officia impedit voluptatum dolore expedita modi sit aut unde recusandae et. Ut aut nemo fugit dignissimos sint voluptas repellendus, aliquid reprehenderit aut harum est ratione suscipit? Corrupti sed, nulla et ab natus sit doloremque hic natus autem ut corporis quam est. Perspiciatis modi sed deserunt, ab quia quasi qui illo nihil dignissimos omnis odio aut error; nulla eius autem quidem repudiandae velit itaque sed ipsa quae nulla et aliquid rem praesentium; debitis voluptas, obcaecati non error numquam ut laborum sit atque quia at excepturi tenetur voluptate.', 0, 29),
(35, 'HR00K-0A4OX-5KG1X-TKTN3-5XRSS', 'Beatae possimus sequi dignissimos fuga est tempora consequatur repellendus eaque perspiciatis vel error sed labore. Porro quas, id perspiciatis asperiores illum et delectus sunt omnis nihil iste tempora velit molestias! Delectus dignissimos, repellat natus quia doloribus officia corporis non officia molestias eligendi enim voluptatem inventore. Est et cumque rerum mollitia voluptatem, impedit quidem inventore similique et totam mollitia corporis cupiditate. Voluptatem et corrupti omnis molestiae consequatur fugiat atque, at unde doloribus est non impedit esse; facilis sapiente id voluptates aliquid voluptatem asperiores voluptatem minus autem et ipsam distinctio repellendus blanditiis;\r\nCorrupti maxime omnis culpa voluptatem obcaecati quia dolorem neque soluta dignissimos beatae ipsa culpa molestiae; et iure eaque labore nulla voluptas nostrum et odit mollitia et velit architecto voluptate et. Quam itaque ullam est et sit culpa sed blanditiis perspiciatis dolorem quia mollitia rerum id. Et nihil dolore molestiae porro, consequatur et quis totam quis eum nam error sed doloribus. Libero natus soluta neque non, obcaecati sit placeat quis repellat quia vel ut dolorem rerum? Et nisi consequatur quaerat omnis molestias fuga reprehenderit provident temporibus libero error blanditiis aliquid consequatur. Perspiciatis rerum iure, nesciunt error eum perspiciatis autem natus quidem dolores deleniti quasi voluptatem reprehenderit. Repudiandae quia quibusdam non reiciendis error est consequatur voluptatem velit vero sequi tempore in asperiores. Assumenda fugiat qui ipsam, tenetur perspiciatis veniam repudiandae necessitatibus veniam et impedit sed ut voluptatem. Quam suscipit dolorem aut, suscipit voluptate ipsam odio eos qui praesentium explicabo quasi fugiat ipsum.', 0, 3),
(36, '3QSV8-ISX36-R5R61-I31H1-53I44', 'Eligendi sed eos vel ipsa, eveniet ut eveniet cum ut eligendi qui nam aut nisi. Et sed iusto sint sequi, rerum aut voluptatem et veritatis corrupti commodi eum magni velit. Voluptate vitae sequi iste animi, earum similique cupiditate quia aperiam odit vitae saepe non quia; molestias deserunt est placeat, rem magni non recusandae eum in voluptatem dolorem iure esse deserunt. Quas omnis quia temporibus velit, omnis sit aliquam adipisci labore et error quisquam ut fugiat! Quae qui enim dolores rerum nemo ut nesciunt velit dolor reiciendis quia ut architecto ut. Sed error omnis sint qui iste autem illo ut in accusamus quis voluptatem fugit ratione.', 0, 30),
(37, 'LO6O5-2HLQA-I093T-QRJPQ-0CS6Z', 'Facilis sed dolor ex ut nisi officiis cupiditate ut sit molestiae tenetur minus nobis quis. Commodi ut maiores quisquam ipsam voluptates eligendi magnam quasi molestiae fugit ut odio eligendi harum;\r\nPossimus animi omnis eaque et, dolores pariatur et inventore aspernatur quisquam sit dignissimos sequi omnis. Quae enim voluptatem, facilis quis omnis soluta consequatur porro cum eaque sit ad et unde;\r\nSit aliquid accusantium unde, perspiciatis consectetur illo perspiciatis quia est rerum dicta sit et error; ea doloremque accusamus ut sunt sit accusamus obcaecati earum eum delectus sed excepturi corporis consectetur. Eligendi itaque sit qui sed rem vel minima dolorem perspiciatis asperiores fugiat atque tempora nostrum. Quaerat voluptatem sed hic veniam optio doloribus amet qui rerum unde omnis facere amet voluptatem. Corrupti quo quibusdam aliquid magni officiis qui est fugit harum nam quisquam asperiores maxime consequatur? Ipsam molestiae doloribus culpa aut sint nostrum vel voluptatem unde aliquam expedita et fugiat omnis.', 0, 29),
(38, 'N16H5-3H6QI-7J1B1-42C24-AJ3VP', 'Quidem aliquid impedit exercitationem praesentium enim unde consequatur et maxime sed doloremque non aut dolores. Assumenda quia ut voluptas et ad natus cupiditate provident et ratione ipsam ipsum omnis deleniti. Ex obcaecati nesciunt rerum labore odio quia fugiat consectetur quia et sunt ab in unde? Unde aliquid consectetur non ducimus quia commodi assumenda et qui labore beatae quia consequuntur enim. Eligendi deleniti doloribus tempora ut aliquid est vero quae vitae neque soluta aliquid ipsum est. Quam sed dolor id, et est maiores quod eum in dolor repellendus eos enim obcaecati. Facilis qui ullam ipsum quia eveniet sequi consequuntur perspiciatis commodi facere ut provident a ut; modi sed et perspiciatis et ex distinctio consequatur et, consequatur molestiae sit magni perspiciatis iusto. Facere dolore natus similique est labore sequi dolorem sed ut distinctio est omnis consequatur ut! Necessitatibus enim, accusantium velit dolorum distinctio facilis consectetur ullam doloremque inventore ea unde cumque corporis? Reprehenderit aut labore nemo placeat similique sit consectetur non voluptas, ut sed ut et quia. Dignissimos dolorem ab ut possimus deleniti adipisci eum laborum voluptatem error voluptatem magni illo sequi. Aliquid tempore dolorem modi quo officiis aliquid blanditiis qui unde distinctio aut cupiditate voluptatem eum. Quidem maxime sint, cumque dolorum fuga aut sunt ab neque quasi repudiandae sed eos qui; sapiente eos doloremque non perferendis voluptatem nostrum odit qui maxime sed cupiditate repellendus dicta corporis. Consequatur sit officia aut neque itaque sapiente ab aut architecto sunt officiis odit et natus! Maxime hic nihil minus culpa est ut dolor minima velit omnis incidunt et ut aut.', 1, 6),
(39, 'DIJ1M-Z07BE-50G4W-R2EU6-X617Q', 'Amet et quaerat et ut perspiciatis omnis quis iste pariatur culpa nihil ut rerum et. Sunt enim dolores omnis, deleniti dolorem architecto accusamus eum eaque modi omnis perferendis rerum aliquid; sed maiores velit eos asperiores inventore similique placeat sed ut dolorum dolorem sunt consequatur eos. Est blanditiis dolores consequatur expedita, rem modi ad exercitationem quo sunt sit et rerum et. Vero quos quia voluptatem, ut reprehenderit placeat velit ex ullam perspiciatis repudiandae enim eos alias. Assumenda modi distinctio ut, sit rerum blanditiis vitae ipsam placeat ut voluptatem hic est velit! Ut ipsa, et illum laboriosam dolores id recusandae atque id qui sunt necessitatibus quidem eius.', 0, 7),
(40, '6Q12V-S7YU3-56801-525JZ-RQJNY', 'Earum sint, temporibus nemo sunt doloribus iste quis non nisi vitae consectetur laborum et ut. Et inventore aliquam doloribus nisi et quasi, nisi commodi autem doloribus ut sed eum esse. Exercitationem omnis natus amet quia sed odit sunt sed est nihil voluptas a atque architecto? Aperiam magnam eveniet accusantium sunt, illum repudiandae praesentium dolores qui veritatis ut vero ut voluptatum! Explicabo consequatur a, voluptates non rerum magni quasi odit aliquam pariatur rerum ducimus iste expedita. Nam sit qui nisi sit ratione veritatis quis eum iste voluptas iure quae ex totam. Sed voluptas dolore voluptatem quis iste earum sit incidunt id provident et aliquid ad ullam. Ut qui ipsum doloremque voluptas perspiciatis, veritatis quisquam consectetur perferendis corporis aperiam eligendi quis corporis! Aperiam est earum dolores est natus sit nihil maxime laudantium repellat consequatur magni ut itaque. Doloremque similique inventore voluptatem ad quas est voluptatem consequuntur illo eos itaque iste labore explicabo. Non perspiciatis et sit quod et autem enim iste eligendi est sed provident et officia. Cum architecto, consequatur quae vel distinctio fugiat accusamus sed provident itaque nesciunt sequi suscipit optio. Assumenda totam sapiente nam ex, ut officiis quidem est commodi molestiae minus harum animi eos. Enim et, unde voluptate saepe voluptas et expedita voluptatem a voluptatem officia perspiciatis aut id; consequatur incidunt est error laborum placeat maiores quia odio minus aliquam rerum maxime sed assumenda;\r\nSed ullam et atque, ut perspiciatis asperiores exercitationem ratione sit ut autem laboriosam iste quia; quo eaque minima accusantium placeat et ut autem expedita, perspiciatis omnis error cum similique doloremque. Dolorem ut ipsa accusantium voluptatibus necessitatibus rerum sunt laudantium aut est tempora illo odio aliquam! Quia ut velit provident optio possimus et ducimus rem atque voluptatem officiis excepturi in repellendus. Voluptas nihil error aut et similique natus id enim dolore accusantium eos quas, neque totam. Voluptas qui laudantium quo ducimus omnis error est vero quod et quia iste officiis iste. Mollitia molestias tempore, ex quam ut aspernatur aut explicabo error repudiandae quas reiciendis rerum odio! Cumque magnam rerum esse numquam natus eaque ab est eius saepe ea maiores unde qui. Porro est quae dolor unde nam perspiciatis quod dolorum aspernatur est dolore odio neque nam. Sed qui quam tempora explicabo nesciunt qui autem ut officia aut repellat modi libero suscipit! Laudantium labore porro quis adipisci consequatur voluptatem dolorem nam omnis asperiores et deleniti quis nobis;\r\nLaboriosam qui placeat magnam est voluptas quis sed voluptates non ut velit aut nihil ipsam.', 0, 29);

-- --------------------------------------------------------

--
-- Table structure for table `product_images`
--

CREATE TABLE `product_images` (
  `id` int(11) NOT NULL,
  `name_image` varchar(255) DEFAULT NULL,
  `id_Product_Detail` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product_images`
--

INSERT INTO `product_images` (`id`, `name_image`, `id_Product_Detail`) VALUES
(1, 'Subleonentor', 49),
(2, 'Comlictonphone', 5),
(3, 'Remuter', 40),
(4, 'Ancycler', 13),
(5, 'Transculupphone', 49),
(6, 'Printtinry', 35),
(7, 'Retinra', 9),
(8, 'Cleanholdonry', 11),
(9, 'Refindridge', 28),
(10, 'Readpickewer', 22),
(11, 'Proleadator', 24),
(12, 'Ancordor', 28),
(13, 'Tetopphone', 41),
(14, 'Carttinerer', 8),
(15, 'Charcessonentor', 12),
(16, 'Proculimra', 44),
(17, 'Tweetwoofor', 8),
(18, 'Bijecter', 30),
(19, 'Ampnionon', 3),
(20, 'Transcordimator', 5),
(21, 'Tabputinon', 39),
(22, 'Tecordleton', 36),
(23, 'Transcyclinridge', 45),
(24, 'Comtectimscope', 34),
(25, 'Monotinor', 29),
(26, 'Cartmutscope', 18),
(27, 'Suplifion', 1),
(28, 'Tabtopicridge', 16),
(29, 'Mictelledgra', 25),
(30, 'Printplottentor', 17),
(31, 'Tabpickator', 24),
(32, 'Playtector', 17),
(33, 'Speaktinar', 39),
(34, 'Readculollon', 6),
(35, 'Comtaplra', 40),
(36, 'Carttara', 25),
(37, 'Comtopar', 47),
(38, 'Tabwoofor', 23),
(39, 'Playleedridge', 8),
(40, 'Ancyclepscope', 8),
(41, 'Armcordlet', 28),
(42, 'Rebandupon', 46),
(43, 'Ampwoofer', 15),
(44, 'Ampjectentor', 19),
(45, 'Relictanator', 8),
(46, 'Readniedry', 9),
(47, 'Monocycler', 27),
(48, 'Tabtectlet', 8),
(49, 'Anculexscope', 7),
(50, 'Cartplotteder', 17);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `role_name` varchar(100) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `role_name`) VALUES
(1, 'Admin'),
(2, 'Supper_Admin'),
(3, 'Custommer'),
(4, 'Jerry1985');

-- --------------------------------------------------------

--
-- Table structure for table `role_acount`
--

CREATE TABLE `role_acount` (
  `id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `acount_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `role_acount`
--

INSERT INTO `role_acount` (`id`, `role_id`, `acount_id`) VALUES
(1, 2, 38),
(2, 3, 16),
(3, 3, 36),
(4, 1, 16),
(5, 4, 10),
(6, 1, 5),
(7, 1, 46),
(8, 4, 39),
(9, 4, 11),
(10, 3, 22),
(11, 3, 40),
(12, 4, 40),
(13, 3, 4),
(14, 1, 1),
(15, 3, 29),
(16, 4, 50),
(17, 3, 17),
(18, 4, 36),
(19, 2, 50),
(20, 4, 3);

-- --------------------------------------------------------

--
-- Table structure for table `sale_events`
--

CREATE TABLE `sale_events` (
  `id` int(11) NOT NULL,
  `name_event` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `start_time` datetime(3) DEFAULT NULL,
  `end_time` datetime(3) DEFAULT NULL,
  `sale_style` int(11) DEFAULT NULL,
  `status` tinyint(4) DEFAULT NULL,
  `is_deleted` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sale_events`
--

INSERT INTO `sale_events` (`id`, `name_event`, `start_time`, `end_time`, `sale_style`, `status`, `is_deleted`) VALUES
(1, 'Michael15', '1974-01-09 02:04:19.810', '1987-06-06 02:38:04.060', 1, 1, 0),
(2, 'Ahern4', '1977-06-22 17:39:39.800', '1995-12-03 13:47:17.430', 2, 0, 0),
(3, 'Dallas2017', '1983-10-26 01:26:17.770', '1986-06-23 02:28:21.610', 1, 0, 1),
(4, 'Duane1995', '2006-12-09 02:51:51.940', '2010-03-08 23:04:45.030', 2, 0, 1),
(5, 'Abel7', '1998-08-14 17:33:50.690', '1985-12-05 01:17:14.090', 1, 0, 1),
(6, 'Alfonso219', '2000-06-08 07:02:26.840', '1978-03-28 14:44:07.240', 2, 0, 0),
(7, 'Casey31', '2004-03-13 08:39:23.620', '2008-03-16 11:55:48.070', 1, 1, 0),
(8, 'Abrams87', '2020-06-18 20:56:48.030', '2002-11-08 02:35:40.360', 2, 1, 0),
(9, 'Agustin1966', '2005-12-03 00:19:28.140', '2002-09-15 19:43:06.090', 1, 0, 0),
(10, 'Bates2017', '1988-08-20 09:00:05.180', '1987-06-15 06:14:38.010', 2, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `sizes`
--

CREATE TABLE `sizes` (
  `id` int(11) NOT NULL,
  `size_name` varchar(100) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sizes`
--

INSERT INTO `sizes` (`id`, `size_name`) VALUES
(1, '29'),
(2, '30'),
(3, '31'),
(4, '31'),
(5, '33'),
(6, '34'),
(7, '35'),
(8, 'XL'),
(9, 'L'),
(10, 'M');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acounts`
--
ALTER TABLE `acounts`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`id`),
  ADD KEY `acount_id` (`acount_id`);

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cart_items`
--
ALTER TABLE `cart_items`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_detail_id` (`product_detail_id`),
  ADD KEY `id_cart` (`id_cart`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `colors`
--
ALTER TABLE `colors`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_product` (`id_product`),
  ADD KEY `id_acount` (`id_acount`);

--
-- Indexes for table `detail_orders`
--
ALTER TABLE `detail_orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_product_detail` (`id_product_detail`),
  ADD KEY `order_id` (`order_id`);

--
-- Indexes for table `detail_products`
--
ALTER TABLE `detail_products`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_product` (`id_product`),
  ADD KEY `id_color` (`id_color`),
  ADD KEY `id_size` (`id_size`);

--
-- Indexes for table `discounts`
--
ALTER TABLE `discounts`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_detail_id` (`product_detail_id`),
  ADD KEY `sale_Event_id` (`sale_Event_id`);

--
-- Indexes for table `favories`
--
ALTER TABLE `favories`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_product` (`id_product`),
  ADD KEY `id_acount` (`id_acount`);

--
-- Indexes for table `history_orders`
--
ALTER TABLE `history_orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `order_id` (`order_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_acount` (`id_acount`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`),
  ADD KEY `category_id` (`category_id`);

--
-- Indexes for table `product_images`
--
ALTER TABLE `product_images`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_Product_Detail` (`id_Product_Detail`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `role_acount`
--
ALTER TABLE `role_acount`
  ADD KEY `role_id` (`role_id`),
  ADD KEY `acount_id` (`acount_id`);

--
-- Indexes for table `sale_events`
--
ALTER TABLE `sale_events`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sizes`
--
ALTER TABLE `sizes`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `address`
--
ALTER TABLE `address`
  ADD CONSTRAINT `address_ibfk_1` FOREIGN KEY (`acount_id`) REFERENCES `acounts` (`id`);

--
-- Constraints for table `cart_items`
--
ALTER TABLE `cart_items`
  ADD CONSTRAINT `cart_items_ibfk_1` FOREIGN KEY (`product_detail_id`) REFERENCES `detail_products` (`id`),
  ADD CONSTRAINT `cart_items_ibfk_2` FOREIGN KEY (`id_cart`) REFERENCES `cart` (`id`);

--
-- Constraints for table `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `comments_ibfk_1` FOREIGN KEY (`id_product`) REFERENCES `acounts` (`id`),
  ADD CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`id_acount`) REFERENCES `products` (`id`);

--
-- Constraints for table `detail_orders`
--
ALTER TABLE `detail_orders`
  ADD CONSTRAINT `detail_orders_ibfk_1` FOREIGN KEY (`id_product_detail`) REFERENCES `detail_products` (`id`),
  ADD CONSTRAINT `detail_orders_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`);

--
-- Constraints for table `detail_products`
--
ALTER TABLE `detail_products`
  ADD CONSTRAINT `detail_products_ibfk_1` FOREIGN KEY (`id_product`) REFERENCES `products` (`id`),
  ADD CONSTRAINT `detail_products_ibfk_2` FOREIGN KEY (`id_color`) REFERENCES `colors` (`id`),
  ADD CONSTRAINT `detail_products_ibfk_3` FOREIGN KEY (`id_size`) REFERENCES `sizes` (`id`);

--
-- Constraints for table `discounts`
--
ALTER TABLE `discounts`
  ADD CONSTRAINT `discounts_ibfk_1` FOREIGN KEY (`product_detail_id`) REFERENCES `detail_products` (`id`),
  ADD CONSTRAINT `discounts_ibfk_2` FOREIGN KEY (`sale_Event_id`) REFERENCES `sale_events` (`id`);

--
-- Constraints for table `favories`
--
ALTER TABLE `favories`
  ADD CONSTRAINT `favories_ibfk_1` FOREIGN KEY (`id_product`) REFERENCES `acounts` (`id`),
  ADD CONSTRAINT `favories_ibfk_2` FOREIGN KEY (`id_acount`) REFERENCES `products` (`id`);

--
-- Constraints for table `history_orders`
--
ALTER TABLE `history_orders`
  ADD CONSTRAINT `history_orders_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`id_acount`) REFERENCES `acounts` (`id`);

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`);

--
-- Constraints for table `product_images`
--
ALTER TABLE `product_images`
  ADD CONSTRAINT `product_images_ibfk_1` FOREIGN KEY (`id_Product_Detail`) REFERENCES `detail_products` (`id`);

--
-- Constraints for table `role_acount`
--
ALTER TABLE `role_acount`
  ADD CONSTRAINT `role_acount_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  ADD CONSTRAINT `role_acount_ibfk_2` FOREIGN KEY (`acount_id`) REFERENCES `acounts` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
