![alt text](https://github.com/Pedersen87/2020-isgc08-pedersen/blob/main/images/Avsluta(design).png)
{% for image in site.static_files %}
 {% if image.path contains 'https://github.com/Pedersen87/2020-isgc08-pedersen/blob/main/images/' %}
  ![image]({{ image.path }} 'image')
 {% endif %}
{% endfor %}
