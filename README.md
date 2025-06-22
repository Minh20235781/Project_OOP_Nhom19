# Project OOP Nhóm 19: Isekai Huster

**Isekai Huster** là một game 2D phiêu lưu hành động nơi người chơi vào vai anh chàng
sinh viên Bách Khoa bị xuyên không đến một dungeon xa lạ và phải chiến đấu để sinh tồn, 
khám phá bí ẩn và tìm đường trở về. Game kết hợp giữa yếu tố chiến đấu hành động, 
giải đố nhẹ và cốt truyện sâu sắc theo phong cách JRPG.

---

## Gameplay Overview

- **Thể loại**: 2D Action RPG / Adventure
- **Góc nhìn**: Side-scrolling (ngang)
- **Ngôn ngữ**: Java
- **Đồ họa**: Pixel-art
- **Cốt truyện**: 
Người chơi vào vai một sinh viên Bách Khoa đang làm project cho game của mình thì bỗng nhiên 
lại bị cuốn vào thế giới khác (isekai) trong chính game của mình. Để trở về, nhân vật phải 
đánh bại các quái vật, trùm cuối (Final Boss) và thu thập các mảnh vỡ ký ức rải rác trong thế giới mới.

---

## Tính năng chính

### Hệ thống điều khiển
- Di chuyển trái/phải, nhảy kép
- Tấn công cơ bản, combo
- Né tránh
- Tương tác với vật thể (nút, cửa, vật phẩm)

### Kẻ thù & Boss
- Các loại quái vật với hành vi AI riêng
- Mini-boss ở cuối mỗi vùng
- Final boss với nhiều giai đoạn biến hóa

### Vật phẩm & Trang bị
- Vũ khí: Kiếm, cung, kỹ năng đặc biệt
- Vật phẩm hồi máu, tăng sức mạnh tạm thời
- Các mảnh ký ức để mở khóa kết thúc thật

### AI & Level Design
- AI có thể truy đuổi, né tránh, tấn công theo pattern
- Mỗi bản đồ có ẩn vật phẩm, bí mật và thử thách platform

### Cốt truyện phân nhánh
- Lựa chọn hội thoại ảnh hưởng kết thúc
- Có nhiều ending (Tốt – Bình thường – Tồi – Ẩn)

---

## Công nghệ sử dụng

| Thành phần         | Công nghệ/Thư viện         |
|--------------------|-----------------------------|
| Ngôn ngữ chính      | Java                        |
| Game Engine         | LibGDX / Java2D             |
| IDE                 | IntelliJ IDEA / VSCode      |
| Thư viện âm thanh   | Java Sound API / OpenAL     |
| Quản lý ảnh sprite  | Aseprite / Piskel           |
| Quản lý bản đồ      | Tiled Map Editor (.tmx)     |
| Build system        | Gradle / Maven              |

---

## Cấu trúc thư mục

- IsekaiHuster/
- │
- ├── res/ # Hình ảnh, âm thanh, bản đồ
- │ ├── player_huster/
- │ ├── maps/
- │ ├── sounds/
- │
- ├── src/
- │ ├── main/
- │ │ ├── GamePanel.java
- │ │ ├── entity/ # Quản lý nhân vật, quái, boss
- │ │ ├── tile/ # Tiled map handler
- │ │ ├── ui/ # Hiển thị HUD, menu
- │ │ └── story/ # Quản lý cốt truyện, hội thoại
- │
- ├── README.md
- └── build.gradle

---

## Kế hoạch phát triển

### Giai đoạn 1: Prototype
- Di chuyển, nhảy, đánh cơ bản
- Thiết kế bản đồ cơ bản
- Tải sprite, map, âm thanh

### Giai đoạn 2: Gameplay chính
- AI cơ bản cho quái
- Hệ thống chiến đấu hoàn chỉnh
- NPC hội thoại
- Save/Load game

### Giai đoạn 3: Nội dung & Cốt truyện
- Viết và phân nhánh cốt truyện
- Thiết kế vùng đất tựa như dungeon
- Thiết kế boss

### Giai đoạn 4: Tối ưu & phát hành
- Hiệu ứng chiến đấu & kỹ năng
- Hiển thị HUD đẹp hơn
- Gói game thành file `.jar` hoặc `.exe`

---

## Demo Game

- Các bạn có thể clone về dưới dạng file nén để có thể chơi demo game của nhóm 19 chúng mình.

---

## Đóng góp

Rất hoan nghênh mọi đóng góp!

- Góp ý cốt truyện
- Đề xuất tính năng mới
- Hỗ trợ viết mã, thiết kế bản đồ hoặc thiết kế nhân vật

---

## License

Dự án được phát triển cho mục đích học tập, chưa công khai mã nguồn. 
Nếu sử dụng lại mã, vui lòng xin phép chúng mình.

---

## Liên hệ

- **Tác giả**:
Các thành viên trong nhóm 19:
- Đỗ Đức Tuân - 20235859
- Nguyễn Nhật Minh - 20235781
- Đặng Hoàng Minh - 20235777
- Hoàng Việt - 20235871
- Vũ Anh - 20235657
- Phạm Mạnh Cường - 20235669


