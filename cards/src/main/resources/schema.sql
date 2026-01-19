CREATE TABLE IF NOT EXISTS `cards` (
  `card_id` int NOT NULL AUTO_INCREMENT,
  `mobile_number` varchar(15) NOT NULL,
  `card_number` varchar(100) NOT NULL,
  `card_type` varchar(100) NOT NULL,
  `total_limit` int NOT NULL,
  `amount_used` int NOT NULL,
  `available_amount` int NOT NULL,
  `active_sw` boolean NOT NULL default 0,
  `created_at` date NOT NULL,
  `created_by` varchar(20) NOT NULL,
  `updated_at` date DEFAULT NULL,
  `updated_by` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`card_id`)
);

INSERT INTO `cards` (`mobile_number`, `card_number`, `card_type`, `total_limit`, `amount_used`, `available_amount`, `active_sw`, `created_at`, `created_by`) VALUES
('9876543210', '4532123456789012', 'Credit Card', 50000, 15000, 35000, 1, CURDATE(), 'system'),
('9876543211', '4532123456789013', 'Debit Card', 25000, 5000, 20000, 1, CURDATE(), 'system'),
('9876543212', '4532123456789014', 'Credit Card', 75000, 25000, 50000, 1, CURDATE(), 'system'),
('9876543213', '4532123456789015', 'Debit Card', 30000, 8000, 22000, 1, CURDATE(), 'system'),
('9876543214', '4532123456789016', 'Credit Card', 100000, 40000, 60000, 1, CURDATE(), 'system');