import os

parent_dir,fn1 = "E:/PythonWorkspace/Core_Python/exfiles/","WithStmt.txt"
with open(os.path.join(parent_dir,fn1),'w+') as f:
    f.writelines(["<----This file is for with statement example---->","\n<----By usin with statement we don't have to close any resource"])
    f.seek(0,0)
    print("Read file line : ",f.readline())
    print("Inside with File closed after read and write : ",f.closed)
print("Outside with File closed after read and write : ",f.closed)