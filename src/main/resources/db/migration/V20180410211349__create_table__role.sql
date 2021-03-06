-- Create table
create table cf_rest_role (
  id         bigint       not null auto_increment,
  created_by bigint,
  created_on datetime,
  updated_by bigint,
  updated_on datetime,
  cod        varchar(255) not null,
  primary key (id)
)
engine=MyISAM
DEFAULT CHARSET=UTF8
;

-- Unique constraints
alter table role add constraint cf_rest_role_u1
                         unique (cod)
