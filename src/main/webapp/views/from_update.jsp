<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Thông tin từ Map</h2>
    <p>Tên đầy đủ: ${user.fullname}</p>
    <p>Giới tính: ${user.gender ? 'Male' : 'Female'}</p>
    <p>Quốc gia: ${user.country}</p>

    <h2>Thông tin từ Java Bean</h2>
    <p>Tên đầy đủ: ${userBean.fullname}</p>
    <p>Giới tính: ${userBean.gender ? 'Male' : 'Female'}</p>
    <p>Quốc gia: ${userBean.country}</p>

    <form action="/update" method="post">
        <div>Fullname: <input type="text" name="fullname" value="${user.fullname}" /></div>
        <div>Gender: 
            <input type="radio" name="gender" value="true" ${user.gender ? 'checked' : ''}> Male
            <input type="radio" name="gender" value="false" ${!user.gender ? 'checked' : ''}> Female
        </div>
        <div>Country: 
            <select name="country">
                <option value="VN" ${user.country == 'VN' ? 'selected' : ''}>Việt Nam</option>
                <option value="US" ${user.country == 'US' ? 'selected' : ''}>United States</option>
                <option value="CN" ${user.country == 'CN' ? 'selected' : ''}>China</option>
            </select>
        </div>
        <button type="submit">Update</button>
    </form>
</body>
</html>