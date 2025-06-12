# Project-IT4082-Group26
### Thành viên

| Name| Student ID| Role|
| - | - | - |
| Phan Sỹ Hùng | 20225631 | Team Leader|
| Ngô Văn Cao | 20225793 | Member|
| Phùng Quang Khải | 20225639 | Member|
| Phan Hoàng Long | 20225738 | Member|
| Lê Minh Quang | 2022xxxx | Member |

### Mô tả yêu cầu
Chung cư BlueMoon tọa lạc ngay ngã tư Văn Phú được khởi công xây dựng năm 2021 và hoàn thành vào năm 2023. Chung cư được xây dựng trên diện tích 450m², gồm 30 tầng, tầng 1 làm kiot, 4 tầng để, 24 tầng nhà ở và 1 tầng penthouse. Khu đô thị chung cư được thiết kế hiện đại, sang trọng và chú trọng sự hài hòa với không gian sống của cư dân sinh sống nơi đây.

Hàng tháng, Ban quản trị chung cư lập danh sách các khoản phí căn hộ mới hợp gia đình và gửi thông báo tiền. Các khoản phí chung cư gồm nhiều loại:

1. **Phí dịch vụ chung cư**: đây là loại phí bắt buộc nộp theo tháng, bao gồm tất cả các hoạt động liên quan đến việc quản lý vận hành nhà chung cư. Chi phí này phụ thuộc vào tiêu chuẩn, chất lượng của dự án chung cư và dịch vụ như chung cư cao cấp, chung cư thường hay nhà chung cư giá rẻ. Với chung cư BlueMoon phí quản lý này ở mức 7.000 đồng/m².

2. **Phí quản lý chung cư**: đây là chi phí bắt buộc nộp theo tháng, dùng cho tất cả các hoạt động liên quan đến việc quản lý vận hành nhà chung cư. Chi phí này phụ thuộc vào tiêu chuẩn, chất lượng của các chung cư đó và có thể dao động từ 2.500 đồng tới 16.500 đồng mỗi tháng.

3. **Các khoản đóng góp**: mà ban quản trị sẽ phối hợp với chính quyền địa phương, tổ dân phố để thực hiện thu (với đối tượng người nghèo, quê biệt đảo, quý tử thiện...). Các khoản đóng góp này thu theo từng đợt, không bắt buộc và thu theo tính toán tình nguyện.

## Ví dụ một mẫu số quản lý thu các khoản đóng góp:
| Hộ gia đình | Phí dịch vụ | Phí quản lý | Đóng góp | Tổng cộng |
|-------------|-------------|-------------|----------|-----------|
| Hộ 1       | 500,000 VND | 140,000 VND | 50,000 VND | 690,000 VND |
| Hộ 2       | 700,000 VND | 196,000 VND | 100,000 VND | 996,000 VND |

## Phiên bản 1.0
Trong phiên bản v1.0 của phần mềm, các chức năng cơ bản cần xây dựng cho Ban quản trị bao gồm:

1. **Quản lý thông tin các khoản thu phí đóng góp**
   - Quản lý các khoản phí dịch vụ và quản lý của mỗi hộ gia đình.
   - Quản lý các khoản đóng góp bất buộc.

2. **Quản lý thu phí của các hộ gia đình**
   - Theo dõi và ghi nhận các khoản phí đã được thanh toán.
   - Cung cấp thông tin và biến lai cho các hộ gia đình.

3. **Chức năng tra cứu và tìm kiếm**
   - Tra cứu thông tin các khoản phí thu từng hộ gia đình.
   - Tìm kiếm thông tin liên quan đến các khoản phí và đóng góp.

4. **Thống kê cơ bản**
   - Cung cấp báo cáo thống kê về các khoản thu phí.
   - Theo dõi tình trạng thanh toán của các hộ gia đình.

5. **Quản lý thông tin cơ bản về các hộ gia đình và nhân khẩu**
   - Quản lý thông tin hộ khẩu và nhân khẩu đang sinh sống tại BlueMoon.
   - Cung cấp thông tin chi tiết về hộ gia đình, nhân khẩu trong hộ, các hoạt động biến đổi nhân khẩu, tạm vắng, tạm trú,...
6. **Bảo mật và quản lý tài khoản**
   - Các chức năng này chỉ truy cập được sau khi Ban quản trị đăng nhập thành công với tài khoản đã cung cấp.
   - Ban quản trị cũng có thể quản lý các thông tin cá nhân và thay đổi mật khẩu đăng nhập.

## Phiên bản 2.0

Trong phiên bản v2.0 phát triển tiếp theo của phần mềm, Ban quản trị muốn xây dựng thêm các chức năng:

1. **Quản lý các khoản thu phí gửi xe ở chung cư**
   - Thu phí từng tháng theo thông tin phương tiện đăng ký của hộ gia đình.
   - Phí gửi xe máy tháng là 70.000 VND/xe/một tháng.
   - Phí gửi ô tô là 1.200.000 VND/xe/một tháng.

2. **Quản lý chi phí điện, nước, internet**
   - Thu hộ từng tháng theo thông báo từ các công ty cung cấp dịch vụ tương ứng.

### Yêu cầu kỹ thuật

Phần mềm dự kiến được phát triển dưới dạng một ứng dụng desktop với công nghệ Java, dữ liệu của phần mềm được lưu trữ tập trung trên MySQL server. Nhóm phát triển có thể tìm hiểu và lựa chọn các công nghệ khác phù hợp trong giải pháp cơ bài toán.

---
