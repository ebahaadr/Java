-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 22 Oca 2021, 14:30:19
-- Sunucu sürümü: 10.4.17-MariaDB
-- PHP Sürümü: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `hastane`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminler`
--

CREATE TABLE `adminler` (
  `username` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `password` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`username`, `password`) VALUES
('enesbalaban', '1907'),
('doğanayaz', '1907');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `doktorlar`
--

CREATE TABLE `doktorlar` (
  `id` int(11) NOT NULL,
  `ad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `bolum` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `tcNo` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `cinsiyet` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `email` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `telefonNo` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `doktorlar`
--

INSERT INTO `doktorlar` (`id`, `ad`, `soyad`, `bolum`, `tcNo`, `cinsiyet`, `email`, `telefonNo`) VALUES
(21, 'Orhun Alp', 'Yamen', 'KBB', '1234', 'Erkek ', 'orhunalpyamen@gmail.com', '553');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hastalar`
--

CREATE TABLE `hastalar` (
  `id` int(11) NOT NULL,
  `isim` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyisim` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `cinsiyet` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `email` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `telefonNo` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `polikinlik` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `tcNo` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `saat` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `hastalar`
--

INSERT INTO `hastalar` (`id`, `isim`, `soyisim`, `cinsiyet`, `email`, `telefonNo`, `polikinlik`, `tcNo`, `saat`) VALUES
(177, 'Enes', 'Balaban', 'Erkek', 'enesb@gmail.com', '123', 'Acil', '123', '08.00'),
(178, 'Yunus', 'Ayaz', 'Erkek', 'yunusd@gmail.com', '12345', 'KBB', '1234', '08.00');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `polikinlikler`
--

CREATE TABLE `polikinlikler` (
  `id` int(11) NOT NULL,
  `ad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `kapasite` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `odaSayisi` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `polikinlikler`
--

INSERT INTO `polikinlikler` (`id`, `ad`, `kapasite`, `odaSayisi`) VALUES
(7, 'Acil', 'dsf', 'fsd');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `doktorlar`
--
ALTER TABLE `doktorlar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `hastalar`
--
ALTER TABLE `hastalar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `polikinlikler`
--
ALTER TABLE `polikinlikler`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `doktorlar`
--
ALTER TABLE `doktorlar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Tablo için AUTO_INCREMENT değeri `hastalar`
--
ALTER TABLE `hastalar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=179;

--
-- Tablo için AUTO_INCREMENT değeri `polikinlikler`
--
ALTER TABLE `polikinlikler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
