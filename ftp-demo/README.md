### ftp 安装
```bash
   软件： vsftpd
#是否安装
rpm -qa | grep vsftp
#安装
yum install vsftpd -y

#修改，禁止匿名登录
vim /etc/vsftpd/vsftpd.conf 
    anonymous_enable=FALSE

#开启 vsftpd
systemctl start vsftpd 

#检查是否开启
netstat -utnlp|grep 21

#vim /etc/vsftpd/ftpusers
#分配账号
useradd duiu
passwd duiu


```
 
    
