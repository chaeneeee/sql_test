CREATE TABLE `role` (
`id` int PRIMARY KEY AUTO_INCREMENT NOT NULL,
  `name` varchar(255) NOT NULL
  );


CREATE TABLE `user` (
  `id` int PRIMARY KEY AUTO_INCREMENT NOT NULL ,
  `name` varchar(255) not NULL  ,
  `email` varchar(255) not NULL

);

CREATE TABLE `content` (
    `id` int PRIMARY KEY AUTO_INCREMENT,
    `title` varchar(255),
    `body` varchar(255),
  `created_at` timestamp not NULL DEFAULT CURRENT_TIMESTAMP,
  `userId` int,
  FOREIGN KEY (`userId`) REFERENCES `user` (`id`)
);




CREATE TABLE `category`(
`id` int PRIMARY KEY  AUTO_INCREMENT NOT NULL,
`name` varchar(255) NOT NULLc
);

CREATE TABLE `content_category`(
`id` int PRIMARY KEY AUTO_INCREMENT NOT NULL,
`contentId` int not null,
`categoryId` int not null,
FOREIGN KEY (`contentId`) REFERENCES `content`(`id`),
FOREIGN KEY (`categoryId`) REFERENCES `category`(`id`)
);



ALTER TABLE `user` ADD roleId int;
ALTER TABLE `user` ADD FOREIGN KEY (`roleId`) REFERENCES `role` (`id`);