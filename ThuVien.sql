--Tạo bảng sách 
CREATE DATABASE ThuVien
USE ThuVien
CREATE TABLE Sach (
IDsach char(10) not null primary key,
TheLoai nvarchar(100) not null,
TenSach nvarchar(100) not null,
GiaSach int not null,
TinhTrang nvarchar(100) default N'tot'not null,
ViTri nvarchar(100) not null
)

select * from Sach
drop table Sach

--Thêm sách 
insert into Sach 	(IDsach, TheLoai,TenSach,GiaSach, TinhTrang, ViTri)
values				    ( 's0001',  N'Truyện tranh', 'Thám tử lung danh Conan - Tập 100 ',150000, 'tot', 'tang2,gia12,ngan15'),
						( 's0002',  N'Truyện tranh', 'Thám tử lung danh Conan - Tập 101 ',150000, 'tot', 'tang2,gia12,ngan15'),
						( 's0003',  N'Truyện tranh', 'Thám tử lung danh Conan - Tập 102 ',150000, 'tot', 'tang2,gia12,ngan15'),
						( 's0004',  N'Văn Học', 'Những Ngày Thơ Ấu - Nguyên Hồng ',24000, 'tot', 'tang2,gia12,ngan15'),
						( 's0005',  N'Văn Học', 'Đất rừng phương nam - Đoàn Giỏi',40000, 'tot', 'tang2,gia12,ngan15'),
						( 's0006',  N'Văn Học', 'Quê Nội - Võ Quảng ',40000, 'tot', 'tang2,gia12,ngan15'),
						( 's0007',  N'Văn Học', 'Quê Nội - Võ Quảng ',40000, 'tot', 'tang2,gia12,ngan15'),
						( 's0008',  N'Truyện tranh', 'Thám tử lung danh Conan - Tập 100 ',150000, 'tot', 'tang2,gia12,ngan15'),
						( 's0009',  N'Văn Học', 'Quê Nội - Võ Quảng ',40000, 'tot', 'tang2,gia12,ngan15')





-- Tạo bảng Sinh Viên
USE ThuVien
   Create table SinhVien (
   TenSV Nvarchar(50) not null,
    MSSV char(10) primary key,
   Lop_QL Nvarchar(50) not null,
   Khoa Nvarchar(50) not null,
   Email char(50) not null,
   )
insert into SinhVien(TenSV,MSSV,Lop_QL,Khoa,Email)
values				    ( 'Vu Tien Dung', '51465', '65IT3', 'CNTT', '123@gmail.com'),
						( 'Nguyen Tien Dung', '61465', '65IT6', 'CNTT', '456@gmail.com'),
						( ' Nguyen Duy Anh', '71465', '65IT3', 'CNTT', '789@gmail.com' )

-- Tạo bảng phiếu mượn 
USE ThuVien
 Create table PhieuMuon(
 IDMuon char (10) primary key,
 MSSV char(10) not null FOREIGN KEY  REFERENCES SinhVien(MSSV),
 IDsach char(10) not null FOREIGN KEY  REFERENCES Sach(IDsach),
 NgayMuon char(10) not null,
 HanTra char(10) not null,
 NgayTra char(10) not null,
 TinhTrang bit not null
 )
-- Tạo bảng phiếu phạt 
USE ThuVien
Create table PhieuPhat (
IDPhat char(20) primary key not null,
IDMuon char(10) not null FOREIGN KEY  REFERENCES PhieuMuon(IDMuon),
MSSV char(10) not null FOREIGN KEY  REFERENCES SinhVien(MSSV), 
NgayXL char(10) not null,
LDXL nvarchar(50) not null,
HTXL nvarchar(100) not null,
TinhTrang bit not null
)

