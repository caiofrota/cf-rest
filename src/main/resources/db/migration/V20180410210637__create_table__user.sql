-- Create table
create table cf_rest_user (
  id         bigint       not null auto_increment,
  created_by bigint,
  created_on datetime,
  updated_by bigint,
  updated_on datetime,
  email      varchar(255) not null,
  enabled    bit          not null,
  name       varchar(255) not null,
  password   varchar(255) not null,
  primary key (id)
)
engine=MyISAM
DEFAULT CHARSET=UTF8
;

-- Unique constraints
alter table user add constraint cf_rest_user_u1
                         unique (email);
