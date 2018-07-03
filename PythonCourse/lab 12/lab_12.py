import re

if __name__=="__main__":
    file =open("access_log_Jul95")
    kil=0
    for line in file:
        result=re.match(r".+01/Jul/1995:0(?:0:2[1-9]|[3-5][0-9]|[1-5]:\d{2}|6:[0-4][0-9]|6:5[0-1]):\d{2}\s-0\d+]\s\"[^G].+",line)
        if result:
            print(line[result.start():result.end()])
            kil+=1
    print(kil)