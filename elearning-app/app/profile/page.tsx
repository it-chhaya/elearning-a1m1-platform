"use client"

import {useEffect, useState} from "react";

type Category = {
    id: number,
    name: string
}

export default function Page() {

    const [categories, setCategories] = useState<Category[]>();

    useEffect(() => {
        function fetchCategories() {
            fetch("/api/v1/categories")
                .then(res => res.json())
                .then(json => {
                    console.log(json)
                    setCategories(json.content)
                })
        }
        fetchCategories()
    }, [setCategories])

    return (
        <>
            {
                categories && categories.map(category => (
                    <a
                        className="inline-flex items-center justify-center rounded-full border border-indigo-600 bg-indigo-600 px-6 py-3 text-sm font-semibold text-white shadow-sm transition-colors hover:bg-indigo-700 focus-visible:ring-4 focus-visible:ring-indigo-200 focus-visible:outline-none"
                        href="#"
                    >
                        {category.id} - {category.name}
                    </a>
                ))
            }
        </>
    );
}