import React, {useEffect, useState} from 'react';
import {useParams} from "react-router-dom";

const View = () => {

	let {id} = useParams();
	const [item, setItem] = useState([]);

	useEffect(() => {
		fetch("/api/board/view/" + id)
			.then((response) => {
				return response.json();
			})
			.then(function (data) {
				setItem(data);
			});
	}, []);

    const { title } = item;

	return (
		<div>
			<h1>상세보기</h1>
            <p>
                <strong>{title}</strong>
            </p>
		</div>
	);
};

export default View;