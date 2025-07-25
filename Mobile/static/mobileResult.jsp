<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<h1>Mobile Application</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="mobileResult.jsp">Mobile Application</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<h1>Your Details</h1>
<strong><h2>MobileId: ${dto.mobileId}</h2></strong>
<strong><h2>Model: ${dto.model}</h2></strong>
<strong><h2>Brand: ${dto.brand}</h2></strong>
<strong><h2>Operating System: ${dto.operatingSystem}</h2></strong>
<strong><h2>Ram Size: ${dto.ramSize}</h2></strong>
<strong><h2>Storage Capacity: ${dto.storageCapacity}</h2></strong>
<strong><h2>Price: ${dto.price}</h2></strong>
<strong><h2>Rating: ${dto.rating}</h2></strong>

</body>
</html>





