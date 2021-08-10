# URL-parameters-getter
Gets all the available parameters in a URL. Then prints the "key : value" format. 
Sample Input 1:
https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
Sample Output 1:

pass : 12345
port : 8080
cookie : not found
host : localhost
password : 12345
Sample Input 2:

https://target.com/index.html?port=8080&cookie=&host=localhost
Sample Output 2:

port : 8080
cookie : not found
host : localhost
