CREATE TABLE IF NOT EXISTS `accounts` (
   `account_number` int AUTO_INCREMENT  PRIMARY KEY,
   `mobile_number` varchar(20) NOT NULL,
   `account_type` varchar(100) NOT NULL,
   `branch_address` varchar(200) NOT NULL,
   `active_sw` boolean NOT NULL default 0,
   `created_at` date NOT NULL,
   `created_by` varchar(20) NOT NULL,
   `updated_at` date DEFAULT NULL,
   `updated_by` varchar(20) DEFAULT NULL
);

INSERT INTO `accounts` (`mobile_number`, `account_type`, `branch_address`, `active_sw`, `created_at`, `created_by`) VALUES
('9876543210', 'Savings', '123 Main Street, New York', 1, CURDATE(), 'system'),
('9876543211', 'Current', '456 Oak Avenue, Los Angeles', 1, CURDATE(), 'system'),
('9876543212', 'Savings', '789 Pine Road, Chicago', 1, CURDATE(), 'system'),
('9876543213', 'Current', '321 Elm Street, Houston', 1, CURDATE(), 'system'),
('9876543214', 'Savings', '654 Maple Drive, Phoenix', 1, CURDATE(), 'system');