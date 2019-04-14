USE `testdatabase`;


CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(45) DEFAULT NULL,
  `password` varchar(5000) DEFAULT NULL,
  `vegetarian` int(11) DEFAULT NULL,
  `produce` int(11) DEFAULT NULL,
  `car` int(11) DEFAULT NULL,
  `public_transportation` int(11) DEFAULT NULL,
  `bike` int(11) DEFAULT NULL,
  `temperature` int(11) DEFAULT NULL,
  `solar` int(11) DEFAULT NULL,
  `total_saved` int(11) DEFAULT NULL,
  `total_used` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

