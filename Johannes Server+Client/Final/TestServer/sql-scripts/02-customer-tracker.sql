USE `testdatabase`;


CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `vegetarian` int(11) DEFAULT NULL,
  `produce` int(11) DEFAULT NULL,
  `transportation` int(11) DEFAULT NULL,
  `temperature` int(11) DEFAULT NULL,
  `solar` int(11) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

