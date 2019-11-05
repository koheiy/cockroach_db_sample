# install CockroachDB for Ubuntu(single node, insecure)
```
wget https://binaries.cockroachdb.com/cockroach-latest.linux-amd64.tgz
tar xvzf ./cockroach-latest.linux-amd64.tgz
sudo cp -p ./cockroach-v19.1.5.linux-amd64/cockroach /usr/local/bin
cockroach version
cockroach start --insecure --background --advertise-host=x.x.x.x(hostip)
```


# Setup CockroachDB
```
create user if not exists maxroach;
create database parrot;
use parrot;
create table if not exists employee (id INT PRIMARY KEY, name STRING, age INT);
insert into employee(id, name, age) values(1, 'parrot', 20);
grant all on database parrot to maxroach;
grant all on table employee to maxroach;
```
