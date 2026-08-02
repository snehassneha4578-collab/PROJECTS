#!/bin/bash

# Color Codes
GREEN='\033[0;32m'
BLUE='\033[0;34m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
NC='\033[0m'

# Log File
LOGFILE="system_monitor.log"

# Header
echo -e "${GREEN}================================${NC}"
echo -e "${BLUE}     Linux System Monitor       ${NC}"
echo -e "${GREEN}================================${NC}"

echo "Monitoring Started: $(date)" >> $LOGFILE

# System Information
echo ""
echo -e "${YELLOW}System Information:${NC}"
echo "Hostname       : $(hostname)"
echo "Kernel Version : $(uname -r)"
echo "Current User   : $(whoami)"
echo "System Time    : $(date)"

while true
do

echo ""
echo -e "${BLUE}Choose Monitoring Option:${NC}"
echo "1. Show Date and Time"
echo "2. Show Memory Usage"
echo "3. Show Disk Usage"
echo "4. Show CPU Usage"
echo "5. Show Network Information"
echo "6. Show Running Processes"
echo "7. Show System Uptime"
echo "8. Real-Time Monitoring"
echo "9. Exit"

read -p "Enter your choice: " choice

case $choice in

1)
echo -e "${GREEN}Current Date and Time:${NC}"
date
date >> $LOGFILE
;;

2)
echo -e "${GREEN}Memory Usage:${NC}"
free -h
free -h >> $LOGFILE
;;

3)
echo -e "${GREEN}Disk Usage:${NC}"
df -h
df -h >> $LOGFILE
;;

4)
echo -e "${GREEN}CPU Usage:${NC}"
top -bn1 | grep "Cpu(s)"
top -bn1 | grep "Cpu(s)" >> $LOGFILE
;;

5)
echo -e "${GREEN}Network Information:${NC}"
ip addr
ip addr >> $LOGFILE
;;

6)
echo -e "${GREEN}Running Processes:${NC}"
ps aux
ps aux >> $LOGFILE
;;

7)
echo -e "${GREEN}System Uptime:${NC}"
uptime
uptime >> $LOGFILE
;;

8)
echo -e "${GREEN}Starting Real-Time Monitoring...${NC}"
top
;;

9)
echo -e "${RED}Exiting Monitor...${NC}"
echo "Monitoring Stopped: $(date)" >> $LOGFILE
break
;;

*)
echo -e "${RED}Invalid Choice${NC}"
;;

esac

done