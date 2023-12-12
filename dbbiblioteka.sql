-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2023 at 12:50 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbbiblioteka`
--

-- --------------------------------------------------------

--
-- Table structure for table `kategorije`
--

CREATE TABLE `kategorije` (
  `id` int(11) NOT NULL,
  `naziv` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `kategorije`
--

INSERT INTO `kategorije` (`id`, `naziv`) VALUES
(4, 'Fikcija'),
(5, 'Nauka'),
(6, 'Povijest'),
(7, 'Fantazija'),
(8, 'Klasici'),
(9, 'Romantika'),
(10, 'Triler'),
(11, 'Horor'),
(12, 'Biografija'),
(13, 'Putopisi'),
(14, 'Kulinarska'),
(15, 'Samopomoć'),
(16, 'Drama'),
(17, 'Avantura'),
(18, 'Misterija');

-- --------------------------------------------------------

--
-- Table structure for table `knjige`
--

CREATE TABLE `knjige` (
  `id` int(11) NOT NULL,
  `ime` varchar(50) NOT NULL,
  `autor` varchar(50) NOT NULL,
  `kategorija` int(50) NOT NULL,
  `kolicina` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `knjige`
--

INSERT INTO `knjige` (`id`, `ime`, `autor`, `kategorija`, `kolicina`) VALUES
(3, 'Nasljeđe', 'Dan Brown', 7, 3),
(5, 'Rat i mir', 'Lav Nikolajevič Tolstoj', 8, 1),
(6, 'Harry Potter i Kamen mudraca', 'J.K. Rowling', 7, 8),
(7, 'Lovac na zmajeve', 'Khaled Hosseini', 16, 3),
(8, '1984', 'George Orwell', 4, 6),
(9, 'Igra prijestolja', 'George R.R. Martin', 7, 0),
(10, 'Lovac na duse', 'John Connolly', 10, 0),
(11, 'Petparačke priče', 'Terry Pratchett', 7, 1),
(12, 'Ana Karenjina', 'Lav Nikolajevič Tolstoj', 8, 2),
(13, 'To Kill a Mockingbird', 'Harper Lee', 9, 3),
(14, 'Hobit', 'J.R.R. Tolkien', 7, 11),
(15, 'Ljubav u doba kolere', 'Gabriel Garcia Marquez', 9, 5),
(16, 'Ubiti pticu rugalicu', 'Harper Lee', 11, 4),
(17, 'Alhemičar', 'Paulo Coelho', 15, 7);

-- --------------------------------------------------------

--
-- Table structure for table `korisnici`
--

CREATE TABLE `korisnici` (
  `id` int(11) NOT NULL,
  `ime` varchar(15) NOT NULL,
  `prezime` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `sifra` varchar(20) NOT NULL,
  `isAdmin` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `korisnici`
--

INSERT INTO `korisnici` (`id`, `ime`, `prezime`, `email`, `sifra`, `isAdmin`) VALUES
(35, 'Ahmed', 'Hodžić', 'ahmedhodzic@example.com', 'sifra123', 1),
(36, 'Amina', 'Alić', 'aminalic@example.com', 'password456', 1),
(37, 'Jusuf', 'Karađuzović', 'yusufkaraduzovic@example.com', 'pass1234', 0),
(38, 'Fatima', 'Husović', 'fatimahusovic@example.com', 'password789', 0),
(39, 'Omar', 'Mustafić', 'omarmustafic@example.com', 'sifra456', 1),
(41, 'Hamza', 'Suljić', 'hamzasuljic@example.com', 'password123', 1),
(42, 'Aiša', 'Abdulović', 'aishaabdulovic@example.com', 'sifra789', 0),
(43, 'Ali', 'Mehmedagić', 'alimehmedagic@example.com', 'pass5678', 1),
(44, 'Sara', 'Hodžić', 'sarahodzic@example.com', 'sifra567', 0),
(53, 'Muhamed', 'Ajanovic', 'm.ajanovic@student.uninp.edu.rs', 'sifra', 0),
(54, 'Muhamed', 'Ajanovic', 'ajanovic.uninp@gmail.com', 'sifra', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pozajmnice`
--

CREATE TABLE `pozajmnice` (
  `id` int(11) NOT NULL,
  `korisnik_id` int(11) NOT NULL,
  `knjiga_id` int(11) NOT NULL,
  `Datum` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `pozajmnice`
--

INSERT INTO `pozajmnice` (`id`, `korisnik_id`, `knjiga_id`, `Datum`) VALUES
(4, 35, 3, '2023-06-08'),
(24, 39, 11, '2023-06-18'),
(36, 42, 7, '2023-06-19'),
(37, 42, 10, '2023-06-20'),
(41, 43, 14, '2023-06-21');

-- --------------------------------------------------------

--
-- Table structure for table `rezervacije`
--

CREATE TABLE `rezervacije` (
  `id` int(11) NOT NULL,
  `korisnik_id` int(11) NOT NULL,
  `knjiga_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `rezervacije`
--

INSERT INTO `rezervacije` (`id`, `korisnik_id`, `knjiga_id`) VALUES
(22, 42, 9),
(24, 53, 10);

-- --------------------------------------------------------

--
-- Table structure for table `verifikacije`
--

CREATE TABLE `verifikacije` (
  `id` int(11) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `OTP` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kategorije`
--
ALTER TABLE `kategorije`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `knjige`
--
ALTER TABLE `knjige`
  ADD PRIMARY KEY (`id`),
  ADD KEY `knjiga_kategorija` (`kategorija`);

--
-- Indexes for table `korisnici`
--
ALTER TABLE `korisnici`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pozajmnice`
--
ALTER TABLE `pozajmnice`
  ADD PRIMARY KEY (`id`),
  ADD KEY `knjigaid` (`knjiga_id`),
  ADD KEY `korisnikid` (`korisnik_id`);

--
-- Indexes for table `rezervacije`
--
ALTER TABLE `rezervacije`
  ADD PRIMARY KEY (`id`),
  ADD KEY `knjigaidrez` (`knjiga_id`),
  ADD KEY `korisnikidrez` (`korisnik_id`);

--
-- Indexes for table `verifikacije`
--
ALTER TABLE `verifikacije`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kategorije`
--
ALTER TABLE `kategorije`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `knjige`
--
ALTER TABLE `knjige`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `korisnici`
--
ALTER TABLE `korisnici`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT for table `pozajmnice`
--
ALTER TABLE `pozajmnice`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `rezervacije`
--
ALTER TABLE `rezervacije`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `verifikacije`
--
ALTER TABLE `verifikacije`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `knjige`
--
ALTER TABLE `knjige`
  ADD CONSTRAINT `knjiga_kategorija` FOREIGN KEY (`kategorija`) REFERENCES `kategorije` (`id`);

--
-- Constraints for table `pozajmnice`
--
ALTER TABLE `pozajmnice`
  ADD CONSTRAINT `knjigaid` FOREIGN KEY (`knjiga_id`) REFERENCES `knjige` (`id`),
  ADD CONSTRAINT `korisnikid` FOREIGN KEY (`korisnik_id`) REFERENCES `korisnici` (`id`);

--
-- Constraints for table `rezervacije`
--
ALTER TABLE `rezervacije`
  ADD CONSTRAINT `knjigaidrez` FOREIGN KEY (`knjiga_id`) REFERENCES `knjige` (`id`),
  ADD CONSTRAINT `korisnikidrez` FOREIGN KEY (`korisnik_id`) REFERENCES `korisnici` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
